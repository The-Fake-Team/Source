package models.HistoricalFigure;

import models.HistoricalPeriod.*;
import java.util.Date;

public class King extends HistoricalFigure {
    private String ThuyHieu;
    private String NienHieu;
    private String MieuHieu;
    private int StartTriVi;
    private int EndTriVi;
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

    public void setStartTriVi(int StartTriVi) {
        this.StartTriVi = StartTriVi;
    }
    public void setEndTriVi(int EndTriVi) {
        this.EndTriVi = EndTriVi;
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

    public int getStartTriVi() {
        return StartTriVi;
    }
    public int getEndTriVi() {
        return EndTriVi;
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
                + ", Trivi=" + StartTriVi + "-" + EndTriVi + ", HoangDe=" + HoangDe + ", Name=" + "]";
    }

}
