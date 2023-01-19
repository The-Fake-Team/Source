package Object.HistoricalPeriod;

import java.util.ArrayList;
import java.util.List;

import Object.HistoricalFigure.*;

import java.util.Date;
import java.time.LocalDate;

public class HistoricalPeriod {
    private String QuocHieu;
    private Date thoiGianBatDau;
    private Date thoiGianKetThuc;
    private List<King> danhSachVua = new ArrayList<>();
    
    public HistoricalPeriod(String QuocHieu, Date thoiGianBatDau, Date thoiGianKetThuc) {
        this.QuocHieu = QuocHieu;
        this.thoiGianBatDau = thoiGianBatDau;
        this.thoiGianKetThuc = thoiGianKetThuc;
    }

    public void addVua(King vua) {
        danhSachVua.add(vua);
    }

    public String getName()
    {
        return QuocHieu;
    }
}
