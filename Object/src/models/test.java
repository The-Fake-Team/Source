package models;

import java.util.ArrayList;
import java.util.Date;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.time.LocalDate;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.text.SimpleDateFormat;

import models.Festival.Festival;
import models.HistoricalFigure.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.*;
import org.json.simple.parser.*;

public class test {
    public static void main(String[] args) throws org.json.simple.parser.ParseException {
        ArrayList<Festival> festivals = new ArrayList<Festival>();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM  ");
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
        try (FileReader reader = new FileReader(
                "D://TaiLieu//Nam3//Ky1//OOP//BTL//Code//Source//Object//src//models//Data//festival.json")) {
            Object obj = jsonpanser.parse(reader);
            JSONArray festival = (JSONArray) obj;
            // System.out.println(festival);
            // festival.forEach(fes -> parseFestivalObject((JSONObject) fes));
            for (int i = 0; i < festival.size(); i++) {
                JSONObject fes = (JSONObject) festival.get(i);
                JSONObject fesObject = (JSONObject) fes.get("festivals list");
                String sc = (String) fesObject.get("date (lunar calendar)");
                // System.out.println(date);
                Date date = null;
                try {
                    date = df.parse(sc);
                } catch (Exception ex) {
                    // System.out.println(ex.getMessage());
                }
                String name = (String) fesObject.get("name");
                // System.out.println(name);
                String location = (String) fesObject.get("place");
                // System.out.println(location + "\n");
                Festival f = new Festival(name, date, location);
                festivals.add(f);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // try(FileReader reader = new FileReader(
        // "D://TaiLieu//Nam3//Ky1//OOP//BTL//Code//Source//Object//src//Object//Data//historicalFigures.json")){
        // Object obj = jsonpanser.parse(reader);
        // JSONArray historicalfigure = (JSONArray) obj;
        // historicalfigure.forEach(his -> parseHistoricalFigureObject((JSONObject)
        // his));
        // } catch (FileNotFoundException e) {
        // e.printStackTrace();
        // } catch (IOException e) {
        // e.printStackTrace();
        // }

        System.out.println(festivals.get(0).getTen());
        System.out.println(festivals.get(0).getThoiGian());

    }

    private static void parseFestivalObject(JSONObject fes) {
        JSONObject fesObject = (JSONObject) fes.get("festivals list");
        String date = (String) fesObject.get("date (lunar calendar)");
        // System.out.println(date);
        String name = (String) fesObject.get("name");
        // System.out.println(name);
        String location = (String) fesObject.get("place");
        // System.out.println(location + "\n");

    }
    // private static void parseHistoricalFigureObject(JSONObject his) {
    // JSONObject hisObject = (JSONObject) his.get("thông tin nhân vật");
    // String name = (String) hisObject.get("thông tin chi tiết");
    // System.out.println(name);
    // String birthday = (String) hisObject.get("Tỉnh thành");
    // System.out.println(birthday);
    // String deathday = (String) hisObject.get("tên");
    // System.out.println(deathday);
    // String birthplace = (String) hisObject.get("Thời kì");
    // System.out.println(birthplace);
    // }

}
