package models.HistoricalFigure;

import java.util.Date;
import models.HistoricalPeriod.HistoricalPeriod;

public class HistoricalFigure {
    private String ten;
    private String tenKhac;
    private String NamSinhNamMat;
    private String QueQuan;
    private String Mota;
    private HistoricalPeriod period;

    public HistoricalFigure(String ten, String tenKhac, String NamSinhNamMat, String QueQuan,
            String Mota, HistoricalPeriod period) {
        this.ten = ten;
        this.tenKhac = tenKhac;
        this.QueQuan = QueQuan;
        this.Mota = Mota;
        this.period = period;
    }

    public HistoricalFigure() {
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    public void setTenKhac(String tenKhac) {
        this.tenKhac = tenKhac;
    }
    public void setNamSinhNamMat(String NamSinhNamMat) {
        this.NamSinhNamMat = NamSinhNamMat;
    }
    public void setQueQuan(String QueQuan) {
        this.QueQuan = QueQuan;
    }
    public void setMota(String Mota) {
        this.Mota = Mota;
    }
    public void setPeriod(HistoricalPeriod period) {
        this.period = period;
    }
    public String getTen() {
        return ten;
    }
    public String getTenKhac() {
        return tenKhac;
    }
    public String getNamSinhNamMat() {
        return NamSinhNamMat;
    }
    public String getQueQuan() {
        return QueQuan;
    }
    public String getMota() {
        return Mota;
    }
    public HistoricalPeriod getPeriod() {
        return period;
    }
    
    public String toString() {
        return ten;
    }
}
