package models;

import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.time.LocalDate;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
        Map<String, HistoricalPeriod> periodMap = new HashMap<String, HistoricalPeriod>();

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
            // System.out.println(period);
            for (int i = 0; i < period.size(); i++) {
                JSONObject emp = (JSONObject) period.get(i);
                String name = (String) emp.get("name");
                String start = (String) emp.get("start");
                String end = (String) emp.get("end");

                HistoricalPeriod a = new HistoricalPeriod(name, start, end);
                if (!start.equals("null")) {
                    periodMap.put(start, a);
                }
                periods.add(a);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Set<String> keys = periodMap.keySet();
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
            // System.out.println(period);
            for (int i = 0; i < Figures.size(); i++) {
                JSONObject emp = (JSONObject) Figures.get(i);
                JSONObject empObject = (JSONObject) emp.get("thông tin nhân vật");
                String Mota = (String) empObject.get("thông tin chi tiết");
                String ten = (String) empObject.get("tên");
                String tenKhac = (String) empObject.get("tên khác");
                String NamSinh = (String) empObject.get("Năm sinh");
                Date NgaySinh = null;
                Date NgayMat = null;
                String QueQuan = (String) empObject.get("Tỉnh thành");
                String ThoiKy = (String) empObject.get("Thời kì");

                // Xu li nhung nhan vat sau cong nguyen
                if (ThoiKy.equals("Nước Việt Nam mới")) {
                    ThoiKy = "Nước Việt Nam mới (1945-nay)";
                }
                String[] arr = ThoiKy.split("[()]");
                String[] arr2 = arr[1].split("-");
                String[] arr3 = arr2[1].trim().split("\\s");
                if (arr3.length == 2) {
                    arr2[0] = "-" + arr2[0];
                    arr2[1] = "-" + arr2[1];
                }
                int start = 0;
                int end = 0;
                for (String key : keys) {
                    if (arr2[0].equals(key)) {
                        HistoricalPeriod period = periodMap.get(key);
                        HistoricalFigure b = new HistoricalFigure(ten, tenKhac, NgaySinh, NgayMat, QueQuan, start, end,
                                Mota, period);
                        figures.add(b);
                    }
                }
            }
            for (HistoricalFigure i : figures) {
                if(i.getTen().equals("Nguyễn Văn Cừ")){
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
