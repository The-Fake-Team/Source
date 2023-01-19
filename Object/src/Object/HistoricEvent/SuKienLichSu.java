package Object.SuKienLichSu;

import java.util.ArrayList;
import java.util.List;
import Object.NhanVatLichSu.NhanVatLichSu;

import java.util.Date;
import java.time.LocalDate;



public class SuKienLichSu {
    private String Ten;
    private Date ThoiGianBatDau;
    private Date ThoiGianKetThuc;
    private List<NhanVatLichSu> NhanVatLienQuan = new ArrayList<>();
    private String MoTa;

    public SuKienLichSu(String Ten, Date ThoiGianBatDau, Date ThoiGianKetThuc, List<NhanVatLichSu> NhanVatLienQuan,
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

    public void setNhanVatLienQuan(List<NhanVatLichSu> NhanVatLienQuan) {
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

    public List<NhanVatLichSu> getNhanVatLienQuan() {
        return NhanVatLienQuan;
    }

    public String getMoTa() {
        return MoTa;
    }

}
