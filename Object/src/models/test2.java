package models;

import java.util.ArrayList;

public class test2 {
    public static void main(String[] args) {
        String a = "Trận đồi Độc Lập (1954 )";
        String[] arr = a.split("[()]");
        String[] arr2 = arr[1].split(" - ");

        int start, end;
        start = Integer.parseInt(arr2[0].trim());
        try {
            end = Integer.parseInt(arr2[1]);
        } catch (Exception e) {
           end = start;
        }

    }

}
