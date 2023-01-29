package models.HistoricalFigure;

import models.HistoricalPeriod.*;
import java.util.Date;

public class King extends HistoricalFigure {
    private String ThuyHieu;
    private String NienHieu;
    private String MieuHieu;
    private String Trivi;
    private String TheThu;
    private String HoangDe;

    public King() {
        super();
    }

    public King(String Name, String OtherName, int BirthYear, int DeathYear, String BirthPlace, String Description,
            HistoricalPeriod period) {
        super(Name, OtherName, BirthYear, DeathYear, BirthPlace, Description, period);

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

    public void setTrivi(String Trivi) {
        this.Trivi = Trivi;
    }

    public void setTheThu(String TheThu) {
        this.TheThu = TheThu;
    }

    public void setHoangDe(String HoangDe) {
        this.HoangDe = HoangDe;
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

    public String getHoangDe() {
        return HoangDe;
    }

    @Override
    public String toString() {
        return "King [MieuHieu=" + MieuHieu + ", NienHieu=" + NienHieu + ", TheThu=" + TheThu + ", ThuyHieu=" + ThuyHieu
                + ", Trivi=" + Trivi + "]";
    }

}
