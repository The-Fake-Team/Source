package models.HistoricalPeriod;


public class HistoricalPeriod {
    private String QuocHieu;
    private int StartTime;
    private int EndTime;

    public HistoricalPeriod(String QuocHieu, int start, int end) {
        this.QuocHieu = QuocHieu;
        this.StartTime = start;
        this.EndTime = end;
    }

    public HistoricalPeriod() {
        this.QuocHieu = null;
        this.StartTime = 0;
        this.EndTime = 0;
    }

    public String getName() {
        return QuocHieu;
    }

    public int getStartTime() {
        return StartTime;
    }

    public int getEndTime() {
        return EndTime;
    }

    public void show() {
        System.out.println("Quoc Hieu: " + QuocHieu);
        System.out.println("Thoi Gian Bat Dau: " + StartTime);
        System.out.println("Thoi Gian Ket Thuc: " + EndTime);
    }

}
