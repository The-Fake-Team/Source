package Object;

import java.util.Date;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.time.LocalDate;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import Object.NhanVatLichSu.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.*;
import org.json.simple.parser.*;

public class test {
    public static void main(String[] args) throws org.json.simple.parser.ParseException {
        // NhanVatLichSu a = new NhanVatLichSu(null, null,null,null,null);
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
                "D://TaiLieu//Nam3//Ky1//OOP//BTL//Code//Source//Object//src//Object//Data//festival.json")) {
            Object obj = jsonpanser.parse(reader);
            JSONArray festival = (JSONArray) obj;
            // System.out.println(festival);
            festival.forEach(fes -> parseFestivalObject((JSONObject) fes));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void parseFestivalObject(JSONObject fes) {
        JSONObject fesObject = (JSONObject) fes.get("festivals list");
        String date = (String) fesObject.get("date (lunar calendar)");
        System.out.println(date);
        String name = (String) fesObject.get("name");
        System.out.println(name);
        String location = (String) fesObject.get("place");
        System.out.println(location + "//n");

    }

}

