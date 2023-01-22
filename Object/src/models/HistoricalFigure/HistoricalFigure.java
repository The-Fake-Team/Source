package Object.HistoricalFigure;

import Object.HistoricalPeriod.*;

public class HistoricalFigure {
    private String ten;
    private int NgaySinh;
    private int NgayMat;
    private String QueQuan;
    private HistoricalPeriod TrieuDai;

    public HistoricalFigure(String ten, int NgaySinh, int NgayMat, String QueQuan, HistoricalPeriod TrieuDai) {
        this.ten = ten;
        this.NgaySinh = NgaySinh;
        this.NgayMat = NgayMat;
        this.QueQuan = QueQuan;
        this.TrieuDai = TrieuDai;
    }
    public String getTen() {
        return ten;
    }
    public int getNgaySinh() {
        return NgaySinh;
    }
    public int getNgayMat() {
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
    public void setNgaySinh(int NgaySinh) {
        this.NgaySinh = NgaySinh;
    }
    public void setNgayMat(int NgayMat) {
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

