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

import models.Festival.Festival;
import models.HistoricEvent.HistoricEvent;
import models.HistoricalFigure.*;
import models.HistoricalPeriod.HistoricalPeriod;
import models.HistoricalSite.HistoricalSite;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.*;
import org.json.simple.parser.*;

public class test {
    public static <T> void main(String[] args) throws org.json.simple.parser.ParseException {
        ArrayList<Festival> festivals = new ArrayList<Festival>();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM  ");
        ArrayList<HistoricalPeriod> periods = new ArrayList<HistoricalPeriod>();
        ArrayList<HistoricalFigure> figures = new ArrayList<HistoricalFigure>();
        Map<Integer, HistoricalPeriod> periodMap = new HashMap<Integer, HistoricalPeriod>();
        Map<String, HistoricalFigure> figureMap = new HashMap<String, HistoricalFigure>();

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

                //
                String Name = (String) empObject.get("name");
                String OtherName = (String) empObject.get("other name");
                String Description = (String) empObject.get("description");
                String Place = (String) empObject.get("place");

                // Lấy thời kỳ
                JSONArray arr = (JSONArray) empObject.get("eras");
                JSONObject emp = (JSONObject) arr.get(0);
                Number a = (Number) emp.get("start");
                Number b = (Number) emp.get("end");
                HistoricalPeriod Period = periodMap.get(a.intValue());

                // Lấy năm sinh năm mất
                int BirthYear, DeathYear;
                String birth = (String) empObject.get("yearOfBirth");
                try {
                    String[] str = birth.split("-");
                    String[] str2 = str[0].split(" ");
                    String[] str3 = str[1].split(" ");
                    try {
                        BirthYear = Integer.parseInt(str2[str2.length - 1]);
                    } catch (Exception e) {
                        BirthYear = 0;
                    }
                    try {
                        DeathYear = Integer.parseInt(str3[str3.length - 1]);
                    } catch (Exception e) {
                        DeathYear = 0;
                    }

                } catch (Exception e) {
                    BirthYear = 0;
                    DeathYear = 0;
                }
                HistoricalFigure figure = new HistoricalFigure(Name, OtherName, BirthYear, DeathYear, Description,
                        Place,
                        Period);
                figures.add(figure);
                figureMap.put(Name, figure);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        {// // Đọc King
         // try (FileReader reader = new FileReader(
         // "D://TaiLieu//Nam3//Ky1//OOP//BTL//Code//Source//Object//src//models//Data//testoutKing.json"))
         // {
         // Object obj = jsonpanser.parse(reader);
         // JSONArray Kings = (JSONArray) obj;
         // for (int i = 0; i < Kings.size(); i++) {
         // JSONObject empObject = (JSONObject) Kings.get(i);
         // JSONArray arr = (JSONArray) empObject.get("list king");
         // Number a = (Number) empObject.get("period start");
         // Number b = (Number) empObject.get("period end");
         // String name = (String) empObject.get("name period");
         // int start, end;
         // try {
         // start = a.intValue();
         // } catch (Exception e) {
         // start = -2000;
         // }
         // try {
         // end = b.intValue();
         // } catch (Exception e) {
         // end = 2100;
         // }

            // HistoricalPeriod period = periodMap.get(start);
            // if(period == null) {
            // period = new HistoricalPeriod(name, start, end);
            // periodMap.put(a.intValue(), period);
            // periods.add(period);
            // }
            // for (int j = 0; j < arr.size(); j++) {
            // JSONObject emp = (JSONObject) arr.get(j);
            // String ThuyHieu = (String) emp.get("Thụy hiệu");
            // String MieuHieu = (String) emp.get("Miếu hiệu");
            // String TriVi = (String) emp.get("Trị vì");
            // String TheThu = (String) emp.get("Thế thứ");
            // String NienHieu = (String) emp.get("Niên hiệu");
            // String Vua = (String) emp.get("Vua");
            // if (ThuyHieu == null)
            // ThuyHieu = " ";
            // King king = new King();
            // try {
            // HistoricalFigure figure = figureMap.get(Vua);
            // king = new King(figure.getTen(), figure.getTenKhac(),
            // figure.getNamSinhNamMat(),
            // figure.getQueQuan(), figure.getMota(), ThuyHieu, MieuHieu, TriVi, TheThu,
            // NienHieu,
            // period);
            // } catch (Exception e) {
            // king = new King(null, null, null, null, null, ThuyHieu, MieuHieu, TriVi,
            // TheThu, NienHieu,
            // period);
            // }
            // System.out.println(king.getPeriod().getName());
            // }
            // }

            // } catch (FileNotFoundException e) {
            // e.printStackTrace();
            // } catch (IOException e) {
            // e.printStackTrace();
            // }
        }
        // HistoricalFigure figure = new HistoricalFigure("Lý Thường Kiệt", "Lý Thường
        // Kiệt", -100, 100, "Hà Nội", "abc",
        // null);
        // Festival<HistoricalFigure> festival = new Festival<HistoricalFigure>();
        // festival.addRelatedCharacter(figure);
        // Festival<String> festival1 = new Festival<String>();
        // festival1.addRelatedCharacter("abc");
        // for(HistoricalFigure i : festival.getRelatedCharacters()) {
        // System.out.println(i.getName());
        // }

        // Đọc Event
        // try (FileReader reader = new FileReader(
        // "D://TaiLieu//Nam3//Ky1//OOP//BTL//Code//Source//Object//src//models//Data//history_event.json"))
        // {
        // Object obj = jsonpanser.parse(reader);
        // JSONArray Events = (JSONArray) obj;
        // for (int i = 0; i < Events.size(); i++) {
        // JSONObject empObject = (JSONObject) Events.get(i);

        // // Lấy tên + thời gian diễn ra

        // String Name = (String) empObject.get("name"); // Get Name
        // String[] time = Name.split("[()]"); // Get Time
        // String[] time1 = time[1].split("-");
        // int Start, End;
        // try {
        // Start = Integer.parseInt(time1[0].trim());
        // } catch (Exception e) {
        // Start = 0;
        // }
        // try {
        // End = Integer.parseInt(time1[1].trim());
        // } catch (Exception e) {
        // End = Start;
        // }
        // //
        // String Description = (String) empObject.get("detail");
        // String References = (String) empObject.get("references");

        // // Lấy các site liên quan
        // String ReLatedSites = (String) empObject.get("relatedSites");
        // HistoricEvent event = new HistoricEvent(Name, Start, End, References,
        // Description, ReLatedSites);

        // // Lấy các nhân vật liên quan
        // String ReLatedFigures = (String) empObject.get("relatedFigures");
        // try {
        // String[] str = ReLatedFigures.split(", ");
        // for (int j = 0; j < str.length; j++) {
        // // ArrayList<HistoricalFigure> listFigures = new
        // ArrayList<HistoricalFigure>();
        // // ArrayList<String> listStrings = new ArrayList<String>();
        // if (figureMap.get(str[j]) != null) { // Nếu có trong list nhân vật lịch sử
        // HistoricalFigure figure = figureMap.get(str[j]);
        // event.addRelatedFigure(figure);
        // } else {
        // event.addRelatedFigure(str[j]);
        // }
        // }
        // } catch (Exception e) {
        // // System.out.println("null");
        // }

        // // ArrayList<T> list = event.getRelatedFigures();
        // // for (int j = 0; j < list.size(); j++) {
        // // if (list.get(j) instanceof HistoricalFigure) {
        // // HistoricalFigure figure = (HistoricalFigure) list.get(j);
        // // System.out.println(figure.getName());
        // // } else {

        // // System.out.println(list.get(j));
        // // }
        // // }
        // }
        // } catch (FileNotFoundException e) {
        // e.printStackTrace();
        // } catch (IOException e) {
        // e.printStackTrace();
        // }

        // FESTIVAL

        // try (FileReader reader = new FileReader(
        // "D://TaiLieu//Nam3//Ky1//OOP//BTL//Code//Source//Object//src//models//Data//Festival.json"))
        // {
        // Object obj = jsonpanser.parse(reader);
        // JSONArray Festivals = (JSONArray) obj;

        // for (int i = 0; i < Festivals.size(); i++) {
        // JSONObject empObject = (JSONObject) Festivals.get(i);
        // String Name = (String) empObject.get("name"); // Get Name
        // String time = (String) empObject.get("LunarDate"); // Get Time
        // String place = (String) empObject.get("place");
        // String firstHeld = (String) empObject.get("firstHeld");

        // // Định dạng lại thời gian
        // SimpleDateFormat formatter = new SimpleDateFormat("dd/MM");
        // Date date = new Date();
        // try {
        // date = formatter.parse(time);
        // } catch (Exception e) {
        // }

        // Festival festival = new Festival(Name, date, place, firstHeld);

        // // Lấy các nhân vật liên quan

        // String ReLatedFigures = (String) empObject.get("relatedCharacters");
        // try {
        // String[] str = ReLatedFigures.split(", ");
        // for (int j = 0; j < str.length; j++) {
        // if (figureMap.get(str[j]) != null) { // Nếu có trong list nhân vật lịch sử
        // HistoricalFigure figure = figureMap.get(str[j]);
        // festival.addRelatedFigure(figure);
        // } else {
        // festival.addRelatedFigure(str[j]);
        // }
        // }
        // } catch (Exception e) {
        // // System.out.println("null");
        // }

        // ArrayList<T> a = festival.getRelatedFigures();
        // for (int j = 0; j < a.size(); j++) {
        // if (a.get(j) instanceof HistoricalFigure) {
        // HistoricalFigure figure = (HistoricalFigure) a.get(j);
        // //System.out.println(figure.getName());
        // figure.show();
        // } else {
        // System.out.println(a.get(j));
        // }
        // }
        // }

        // } catch (FileNotFoundException e) {
        // e.printStackTrace();
        // } catch (IOException e) {
        // e.printStackTrace();
        // }
        

        // Đọc Site

        try (FileReader reader = new FileReader(
                "D://TaiLieu//Nam3//Ky1//OOP//BTL//Code//Source//Object//src//models//Data//Historical_site.json")) {
            Object obj = jsonpanser.parse(reader);
            JSONArray Sites = (JSONArray) obj;
            for(int i=0;i<Sites.size();i++)
            {
                JSONObject empObject = (JSONObject) Sites.get(i);
                String Name = (String) empObject.get("name"); // Get Name
                String time = (String) empObject.get("recognitionDate"); // Get Time
                String place = (String) empObject.get("place");
                String summary = (String) empObject.get("summary");
                String description = (String) empObject.get("detail");

                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                Date RecognitionDate = new Date();
                try {
                    RecognitionDate = formatter.parse(time);
                } catch (Exception e) {
                }
                HistoricalSite site = new HistoricalSite(Name, RecognitionDate, place, summary, description);
                site.show();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
