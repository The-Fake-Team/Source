package Object.HistoricalFigure;


import Object.HistoricalPeriod.*;

public class King extends HistoricalFigure {
    private String ThuyHieu;
    private String NienHieu;
    private String MienHieu;
    private String Trivi;
    private HistoricalFigure TheThu;

    public King(String ten, int NgaySinh, int NgayMat, String QueQuan, HistoricalPeriod TrieuDai, String ThuyHieu, String NienHieu, String MienHieu, String Trivi, HistoricalFigure TheThu) {
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
    public void setTheThu(HistoricalFigure TheThu) {
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
    public HistoricalFigure getTheThu() {
        return TheThu;
    }

}
