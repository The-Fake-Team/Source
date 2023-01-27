package models.HistoricalFigure;

import models.HistoricalPeriod.*;
import java.util.Date;

public class King extends HistoricalFigure {
    private String ThuyHieu;
    private String NienHieu;
    private String MieuHieu;
    private String Trivi;
    private String TheThu;

    public King() {
        super();
    }

    public King(String ten, String tenKhac, String NamSinhNamMat, String QueQuan,
            String Mota, String ThuyHieu, String NienHieu, String MieuHieu, String Trivi, String TheThu,
            HistoricalPeriod period) {
        super(ten, tenKhac, NamSinhNamMat, QueQuan, Mota, period);
        this.ThuyHieu = ThuyHieu;
        this.NienHieu = NienHieu;
        this.MieuHieu = MieuHieu;
        this.Trivi = Trivi;
        this.TheThu = TheThu;
    }

    public void setThuyHieu(String ThuyHieu) {
        this.ThuyHieu = ThuyHieu;
    }

    public void setNienHieu(String NienHieu) {
        this.NienHieu = NienHieu;
    }

    public void setMieuHieu(String MieuHieu) {
        this.MieuHieu = MieuHieu;
    }

    public void setTriVi(String Trivi) {
        this.Trivi = Trivi;
    }

    public void setTheThu(String TheThu) {
        this.TheThu = TheThu;
    }

    public String getThuyHieu() {
        return ThuyHieu;
    }

    public String getNienHieu() {
        return NienHieu;
    }

    public String getMieuHieu() {
        return MieuHieu;
    }

    public String getTrivi() {
        return Trivi;
    }

    public String getTheThu() {
        return TheThu;
    }

    @Override
    public String toString() {
        return "King [MieuHieu=" + MieuHieu + ", NienHieu=" + NienHieu + ", TheThu=" + TheThu + ", ThuyHieu=" + ThuyHieu
                + ", Trivi=" + Trivi + "]";
    }

}
