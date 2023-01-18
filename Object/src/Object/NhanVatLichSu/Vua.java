package Object.NhanVatLichSu;

import java.util.Date;
import java.time.LocalDate;




public class Vua extends NhanVatLichSu {
    private String ThuyHieu;
    private String NienHieu;
    private String MienHieu;
    private String Trivi;
    private NhanVatLichSu TheThu;

    public Vua(String ten, Date NgaySinh, Date NgayMat, String QueQuan, String TrieuDai, String ThuyHieu, String NienHieu, String MienHieu, String Trivi, NhanVatLichSu TheThu) {
        super(ten, NgaySinh, NgayMat, QueQuan, TrieuDai);
        this.ThuyHieu = ThuyHieu;
        this.NienHieu = NienHieu;
        this.MienHieu = MienHieu;
        this.Trivi = Trivi;
        this.TheThu = TheThu;
    }
    public void setThuHieu(String ThuyHieu) {
        this.ThuyHieu = ThuyHieu;
    }
    public void setNienHieu(String NienHieu) {
        this.NienHieu = NienHieu;
    }
    public void setMienHieu(String MienHieu) {
        this.MienHieu = MienHieu;
    }
    public void setTrivi(String Trivi) {
        this.Trivi = Trivi;
    }
    public void setTheThu(NhanVatLichSu TheThu) {
        this.TheThu = TheThu;
    }
    public String getThuyHieu() {
        return ThuyHieu;
    }
    public String getNienHieu() {
        return NienHieu;
    }
    public String getMienHieu() {
        return MienHieu;
    }
    public String getTrivi() {
        return Trivi;
    }
    public NhanVatLichSu getTheThu() {
        return TheThu;
    }

}
