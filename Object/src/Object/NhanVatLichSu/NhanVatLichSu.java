package Object.NhanVatLichSu;

import java.util.Date;
import java.time.LocalDate;



public class NhanVatLichSu {
    private String ten;
    private Date NgaySinh;
    private Date NgayMat;
    private String QueQuan;
    private String TrieuDai;

    public NhanVatLichSu(String ten, Date NgaySinh, Date NgayMat, String QueQuan, String TrieuDai) {
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
        return TrieuDai;
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
    public void setTrieuDai(String TrieuDai) {
        this.TrieuDai = TrieuDai;
    }

    public void showInfo() {
        System.out.println("Ten: " + this.ten);
        System.out.println("Ngay sinh: " + this.NgaySinh);
        System.out.println("Ngay mat: " + this.NgayMat);
        System.out.println("Que quan: " + this.QueQuan);
        System.out.println("Trieu dai: " + this.TrieuDai);
    }
}

