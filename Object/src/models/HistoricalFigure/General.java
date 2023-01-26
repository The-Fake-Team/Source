package models.HistoricalFigure;

import models.HistoricalPeriod.*;
import java.util.Date;

public class General extends HistoricalFigure {

    public General(String ten, String tenKhac, Date NgaySinh, Date NgayMat, String QueQuan, int start, int end,
            String Mota, HistoricalPeriod period) {
        super(ten, tenKhac, NgaySinh, NgayMat, QueQuan, start, end, Mota, period);
    }

}