package Object.HistoricalPeriod;

import java.util.ArrayList;
import java.util.List;

import Object.HistoricalFigure.*;

public class HistoricalPeriod {
    private String QuocHieu;
    private int thoiGianBatDau;
    private int thoiGianKetThuc;
    private List<King> danhSachVua = new ArrayList<>();
    
    public HistoricalPeriod(String QuocHieu, int thoiGianBatDau, int thoiGianKetThuc) {
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
    public int getThoiGianBatDau() {
        return thoiGianBatDau;
    }
    public int getThoiGianKetThuc() {
        return thoiGianKetThuc;
    }

}
