package Object.HistoricalPeriod;

import java.util.ArrayList;

public class ListHistoricalPeriod {
    private ArrayList<HistoricalPeriod> listHistoricalPeriod = new ArrayList<HistoricalPeriod>();

    public ListHistoricalPeriod() {
        // TODO Auto-generated constructor stub
    }

    public void addHistoricalPeriod(HistoricalPeriod historicalPeriod) {
        listHistoricalPeriod.add(historicalPeriod);
    }

    public ArrayList<HistoricalPeriod> getListHistoricalPeriod() {
        return listHistoricalPeriod;
    }

    public HistoricalPeriod getHistoricalPeriod(int index) {
        for (HistoricalPeriod obj : listHistoricalPeriod) {
            if (obj.getThoiGianBatDau() <= index && obj.getThoiGianKetThuc() >= index) {
                return obj;
            }
        }
        return null;
    }
}