package Object.DiTichLichSu;
import java.util.Date;
import java.time.LocalDate;
import Object.SuKienLichSu.SuKienLichSu;

public class DiTichLichSu {
    
    private String Ten;
    private Date NamXayDung;
    private String DiaDiem;
    private SuKienLichSu SuKienLienQuan;
    private String MoTa;

    public DiTichLichSu(String Ten, Date NamXayDung, String DiaDiem, SuKienLichSu SuKienLienQuan, String MoTa) {
        this.Ten = Ten;
        this.NamXayDung = NamXayDung;
        this.DiaDiem = DiaDiem;
        this.SuKienLienQuan = SuKienLienQuan;
        this.MoTa = MoTa;
    }
}

