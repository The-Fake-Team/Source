package models;

import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.time.LocalDate;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import models.Data.*;

import javax.sound.midi.SysexMessage;

import models.Festival.Festival;
import models.HistoricalFigure.*;
import models.HistoricalPeriod.HistoricalPeriod;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.*;
import org.json.simple.parser.*;

public class test {
    public static void main(String[] args) throws org.json.simple.parser.ParseException {
        ArrayList<Festival> festivals = new ArrayList<Festival>();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM  ");
        ArrayList<HistoricalPeriod> periods = new ArrayList<HistoricalPeriod>();
        ArrayList<HistoricalFigure> figures = new ArrayList<HistoricalFigure>();
        Map<Integer, HistoricalPeriod> periodMap = new HashMap<Integer, HistoricalPeriod>();
        Map<String, HistoricalFigure> figureMap = new HashMap<String, HistoricalFigure>();

        // HistoricalFigure a = new HistoricalFigure(null, null,null,null,null);
        // a.setTen("Nguyen Van A");
        // a.setNgaySinh(new Date());
        // a.setNgayMat(new Date());
        // a.setQueQuan("Ha Noi");
        // a.setTrieuDai("Trieu Dai Lich Su");
        // Gson gson = new Gson();
        // String json = gson.toJson(a);
        // System.out.println(json);

        JSONParser jsonpanser = new JSONParser();

        // Đọc Thời kỳ
        try (FileReader reader = new FileReader(
                "D://TaiLieu//Nam3//Ky1//OOP//BTL//Code//Source//Object//src//models//Data//period.json")) {
            Object obj = jsonpanser.parse(reader);
            JSONArray period = (JSONArray) obj;
            for (int i = 0; i < period.size(); i++) {
                JSONObject emp = (JSONObject) period.get(i);
                String name = (String) emp.get("name");
                Number a = (Number) emp.get("start");
                Number b = (Number) emp.get("end");
                int start, end;
                try {
                    start = a.intValue();
                } catch (Exception e) {
                    start = 0;
                }
                try {
                    end = b.intValue();
                } catch (Exception e) {
                    end = 2100;
                }
                HistoricalPeriod period1 = new HistoricalPeriod(name, start, end);
                periods.add(period1);
                periodMap.put(start, period1);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Đọc nhân vật lịch sử
        try (FileReader reader = new FileReader(
                "D://TaiLieu//Nam3//Ky1//OOP//BTL//Code//Source//Object//src//models//Data//historicalFigures.json")) {

            Object obj = jsonpanser.parse(reader);
            JSONArray Figures = (JSONArray) obj;
            for (int i = 0; i < Figures.size(); i++) {
                JSONObject empObject = (JSONObject) Figures.get(i);
                ArrayList<String> era = (ArrayList<String>) empObject.get("normalized era");
                String Mota = (String) empObject.get("thông tin chi tiết");
                String ten = (String) empObject.get("tên");
                String tenKhac = (String) empObject.get("Tên khác");
                String NamSinhNamMat = (String) empObject.get("Năm sinh");
                String QueQuan = (String) empObject.get("Tỉnh thành");
                String[] arr = era.get(0).split(" - ");
                Integer start = Integer.valueOf(arr[0]);
                Integer end = Integer.valueOf(arr[1]);
                HistoricalFigure figure = new HistoricalFigure(ten, tenKhac, NamSinhNamMat, QueQuan, Mota,
                        periodMap.get(start));
                if (tenKhac != null)
                    figureMap.put(tenKhac, figure);
                // System.out.println(tenKhac);
                figures.add(figure);

            }
            for (HistoricalFigure i : figures) {
                if (i.getTen().equals("Lý Thường Kiệt")) {
                    // i.show();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Đọc King
        try (FileReader reader = new FileReader(
                "D://TaiLieu//Nam3//Ky1//OOP//BTL//Code//Source//Object//src//models//Data//testoutKing.json")) {
            Object obj = jsonpanser.parse(reader);
            JSONArray Kings = (JSONArray) obj;
            for (int i = 0; i < Kings.size(); i++) {
                JSONObject empObject = (JSONObject) Kings.get(i);
                JSONArray arr = (JSONArray) empObject.get("list king");
                Number a = (Number) empObject.get("period start");
                Number b = (Number) empObject.get("period end");
                String name = (String) empObject.get("name period");
                int start, end;
                try {
                    start = a.intValue();
                } catch (Exception e) {
                    start = -2000;
                }
                try {
                    end = b.intValue();
                } catch (Exception e) {
                    end = 2100;
                }

                HistoricalPeriod period = periodMap.get(start);
                if(period == null) {
                    period = new HistoricalPeriod(name, start, end);
                    periodMap.put(a.intValue(), period);
                    periods.add(period);
                }
                for (int j = 0; j < arr.size(); j++) {
                    JSONObject emp = (JSONObject) arr.get(j);
                    String ThuyHieu = (String) emp.get("Thụy hiệu");
                    String MieuHieu = (String) emp.get("Miếu hiệu");
                    String TriVi = (String) emp.get("Trị vì");
                    String TheThu = (String) emp.get("Thế thứ");
                    String NienHieu = (String) emp.get("Niên hiệu");
                    String Vua = (String) emp.get("Vua");
                    if (ThuyHieu == null)
                        ThuyHieu = " ";
                    King king = new King();
                    try {
                        HistoricalFigure figure = figureMap.get(Vua);
                        king = new King(figure.getTen(), figure.getTenKhac(), figure.getNamSinhNamMat(),
                                figure.getQueQuan(), figure.getMota(), ThuyHieu, MieuHieu, TriVi, TheThu, NienHieu,
                                period);
                    } catch (Exception e) {
                        king = new King(null, null, null, null, null, ThuyHieu, MieuHieu, TriVi, TheThu, NienHieu,
                                period);
                    }
                    System.out.println(king.getPeriod().getName());
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
