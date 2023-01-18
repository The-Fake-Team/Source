package Object.ThoiKyLichSu;

import java.util.ArrayList;
import java.util.List;

import Object.NhanVatLichSu.Vua;

import java.util.Date;
import java.time.LocalDate;


public class ThoiKyLichSu {
    private String QuocHieu;
    private Date thoiGianBatDau;
    private Date thoiGianKetThuc;
    private List<Vua> danhSachVua = new ArrayList<>();
    
    public ThoiKyLichSu(String QuocHieu, Date thoiGianBatDau, Date thoiGianKetThuc) {
        this.QuocHieu = QuocHieu;
        this.thoiGianBatDau = thoiGianBatDau;
        this.thoiGianKetThuc = thoiGianKetThuc;
    }

    public void addVua(Vua vua) {
        danhSachVua.add(vua);
    }

    public String getName()
    {
        return QuocHieu;
    }
}