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
                int start,end;
                try{
                    start = a.intValue();
                }
                catch(Exception e){
                    start = 0;
                }
                try{  
                    end = b.intValue();
                }
                catch(Exception e){
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
                String tenKhac = (String) empObject.get("tên khác");
                String NamSinh = (String) empObject.get("Năm sinh");
                Date NgaySinh = null;
                Date NgayMat = null;
                String QueQuan = (String) empObject.get("Tỉnh thành");
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
