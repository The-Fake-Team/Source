package Object.HistoricEvent;

import java.util.ArrayList;
import java.util.List;
import Object.HistoricalFigure.*;
import Object.HistoricalPeriod.HistoricalPeriod;

import java.util.Date;
import java.time.LocalDate;



public class HistoricEvent {
    private String Ten;
    private Date ThoiGianBatDau;
    private Date ThoiGianKetThuc;
    private List<HistoricalFigure> NhanVatLienQuan = new ArrayList<>();
    private String MoTa;

    public HistoricEvent(String Ten, Date ThoiGianBatDau, Date ThoiGianKetThuc, List<HistoricalFigure> NhanVatLienQuan,
            String MoTa) {
        this.Ten = Ten;
        this.ThoiGianBatDau = ThoiGianBatDau;
        this.ThoiGianKetThuc = ThoiGianKetThuc;
        this.NhanVatLienQuan = NhanVatLienQuan;
        this.MoTa = MoTa;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public void setThoiGianBatDau(Date ThoiGianBatDau) {
        this.ThoiGianBatDau = ThoiGianBatDau;
    }

    public void setThoiGianKetThuc(Date ThoiGianKetThuc) {
        this.ThoiGianKetThuc = ThoiGianKetThuc;
    }

    public void setNhanVatLienQuan(List<HistoricalFigure> NhanVatLienQuan) {
        this.NhanVatLienQuan = NhanVatLienQuan;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public String getTen() {
        return Ten;
    }

    public Date getThoiGianBatDau() {
        return ThoiGianBatDau;
    }

    public Date getThoiGianKetThuc() {
        return ThoiGianKetThuc;
    }

    public List<HistoricalFigure> getNhanVatLienQuan() {
        return NhanVatLienQuan;
    }

    public String getMoTa() {
        return MoTa;
    }


}
