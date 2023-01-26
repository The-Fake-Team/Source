package models.HistoricalSite;
import java.util.Date;
import java.time.LocalDate;
import models.HistoricEvent.*;

public class HistoricalSite {
    
    private String Ten;
    private Date NamXayDung;
    private String DiaDiem;
    private HistoricEvent SuKienLienQuan;
    private String MoTa;

    public HistoricalSite(String Ten, Date NamXayDung, String DiaDiem, HistoricEvent SuKienLienQuan, String MoTa) {
        this.Ten = Ten;
        this.NamXayDung = NamXayDung;
        this.DiaDiem = DiaDiem;
        this.SuKienLienQuan = SuKienLienQuan;
        this.MoTa = MoTa;
    }
}

