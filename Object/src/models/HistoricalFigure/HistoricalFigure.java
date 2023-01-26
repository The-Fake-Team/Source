package models.HistoricalFigure;

import java.util.Date;
import models.HistoricalPeriod.HistoricalPeriod;

public class HistoricalFigure {
    private String ten;
    private String tenKhac;
    private Date NgaySinh;
    private Date NgayMat;
    private String QueQuan;
    private int start;
    private int end;
    private String Mota;
    private HistoricalPeriod period;

    public HistoricalFigure(String ten, String tenKhac, Date NgaySinh, Date NgayMat, String QueQuan, int start, int end,
            String Mota, HistoricalPeriod period) {
        this.ten = ten;
        this.tenKhac = tenKhac;
        this.NgaySinh = NgaySinh;
        this.NgayMat = NgayMat;
        this.QueQuan = QueQuan;
        this.start = start;
        this.end = end;
        this.Mota = Mota;
        this.period = period;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public Date getNgayMat() {
        return NgayMat;
    }

    public void setNgayMat(Date ngayMat) {
        NgayMat = ngayMat;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String queQuan) {
        QueQuan = queQuan;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String mota) {
        Mota = mota;
    }

    public void show() {
        System.out.println("Ten: " + this.ten);
        System.out.println("Ngay sinh: " + this.NgaySinh);
        System.out.println("Ngay mat: " + this.NgayMat);
        System.out.println("Que quan: " + this.QueQuan);
        System.out.println("Thoi ky: " + this.period.getName());
        System.out.println("Mo ta: " + this.Mota);

    }
}
