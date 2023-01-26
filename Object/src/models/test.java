package models;

import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.time.LocalDate;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
            // Number a = null;
            // Number b = null;
            // System.out.println(period);
            for (int i = 0; i < period.size(); i++) {
                JSONObject emp = (JSONObject) period.get(i);
                String name = (String) emp.get("name");
                Number a = (Number) emp.get("start");
                Number b = (Number) emp.get("end");
                if (a == null) {
                    a = 0;
                }
                int start = a.intValue();
                if (b == null) {
                    b = 2100;
                }
                int end = b.intValue();
                HistoricalPeriod period1 = new HistoricalPeriod(name, start, end);
                periods.add(period1);
                periodMap.put(start, period1);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Set<String> keys = periodMap.keySet();
        // for( String key : keys){
        // System.out.println(key);
        // }
        // for (String key : keys) {
        // periodMap.get(key).show();
        // }
        // for (HistoricalPeriod i : periods) {
        // i.show();
        // }

        // Đọc nhân vật lịch sử
        try (FileReader reader = new FileReader(
                "D://TaiLieu//Nam3//Ky1//OOP//BTL//Code//Source//Object//src//models//Data//historicalFigures.json")) {

            Object obj = jsonpanser.parse(reader);
            JSONArray Figures = (JSONArray) obj;
            for (int i = 0; i < Figures.size(); i++) {
                JSONObject empObject = (JSONObject) Figures.get(i);
                // System.out.println(emp.get("normalized era")) ;
                ArrayList<String> era = (ArrayList<String>) empObject.get("normalized era");
                String Mota = (String) empObject.get("thông tin chi tiết");
                String ten = (String) empObject.get("tên");
                String tenKhac = (String) empObject.get("tên khác");
                String NamSinh = (String) empObject.get("Năm sinh");
                Date NgaySinh = null;
                Date NgayMat = null;
                String QueQuan = (String) empObject.get("Tỉnh thành");
                String ThoiKy = (String) empObject.get("Thời kì");
                String[] arr = era.get(0).split(" - ");
                Integer start = Integer.valueOf(arr[0]);
                Integer end = Integer.valueOf(arr[1]);
                HistoricalFigure b = new HistoricalFigure(ten, tenKhac, NgaySinh, NgayMat, QueQuan, start, end,
                        Mota, periodMap.get(start));
                figures.add(b);

            }
            for (HistoricalFigure i : figures) {
                if (i.getTen().equals("Nguyễn Văn Cừ")) {
                    i.show();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
