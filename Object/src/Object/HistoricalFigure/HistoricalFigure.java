package Object.HistoricalFigure;

import java.util.Date;
import Object.HistoricalPeriod.*;
import java.time.LocalDate;



public class HistoricalFigure {
    private String ten;
    private Date NgaySinh;
    private Date NgayMat;
    private String QueQuan;
    private HistoricalPeriod TrieuDai;

    public HistoricalFigure(String ten, Date NgaySinh, Date NgayMat, String QueQuan, HistoricalPeriod TrieuDai) {
        this.ten = ten;
        this.NgaySinh = NgaySinh;
        this.NgayMat = NgayMat;
        this.QueQuan = QueQuan;
        this.TrieuDai = TrieuDai;
    }

    public String getTen() {
        return ten;
    }
    public Date getNgaySinh() {
        return NgaySinh;
    }
    public Date getNgayMat() {
        return NgayMat;
    }
    public String getQueQuan() {
        return QueQuan;
    }
    public String getTrieuDai() {
        return TrieuDai.getName();
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }
    public void setNgayMat(Date NgayMat) {
        this.NgayMat = NgayMat;
    }
    public void setQueQuan(String QueQuan) {
        this.QueQuan = QueQuan;
    }

    public void showInfo() {
        System.out.println("Ten: " + this.ten);
        System.out.println("Ngay sinh: " + this.NgaySinh);
        System.out.println("Ngay mat: " + this.NgayMat);
        System.out.println("Que quan: " + this.QueQuan);
        System.out.println("Trieu dai: " + this.TrieuDai.getName());
    }
}

