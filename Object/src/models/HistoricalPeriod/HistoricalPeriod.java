package models.HistoricalPeriod;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import models.HistoricalFigure.*;

public class HistoricalPeriod {
    private String QuocHieu;
    private int thoiGianBatDau;
    private int thoiGianKetThuc;

    public HistoricalPeriod(String QuocHieu, int start, int end) {
        this.QuocHieu = QuocHieu;
        this.thoiGianBatDau = start;
        this.thoiGianKetThuc = end;
    }

    public HistoricalPeriod() {
        this.QuocHieu = null;
        this.thoiGianBatDau = 0;
        this.thoiGianKetThuc = 0;
    }

    public String getName() {
        return QuocHieu;
    }

    public int getThoiGianBatDau() {
        return thoiGianBatDau;
    }

    public int getThoiGianKetThuc() {
        return thoiGianKetThuc;
    }

    public void show() {
        System.out.println("Quoc Hieu: " + QuocHieu);
        System.out.println("Thoi Gian Bat Dau: " + thoiGianBatDau);
        System.out.println("Thoi Gian Ket Thuc: " + thoiGianKetThuc);
    }

}
