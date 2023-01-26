package models.HistoricalPeriod;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import models.HistoricalFigure.*;

public class HistoricalPeriod {
    private String QuocHieu;
    private String thoiGianBatDau;
    private String thoiGianKetThuc;

    public HistoricalPeriod(String QuocHieu, String start, String end) {
        this.QuocHieu = QuocHieu;
        this.thoiGianBatDau = start;
        this.thoiGianKetThuc = end;
    }

    public HistoricalPeriod() {
        this.QuocHieu = null;
        this.thoiGianBatDau = null;
        this.thoiGianKetThuc = null;
    }

    public String getName() {
        return QuocHieu;
    }

    public String getThoiGianBatDau() {
        return thoiGianBatDau;
    }

    public String getThoiGianKetThuc() {
        return thoiGianKetThuc;
    }

    public void show() {
        System.out.println("Quoc Hieu: " + QuocHieu);
        System.out.println("Thoi Gian Bat Dau: " + thoiGianBatDau);
        System.out.println("Thoi Gian Ket Thuc: " + thoiGianKetThuc);
    }

}
