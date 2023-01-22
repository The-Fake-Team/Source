package Object.Festival;
import java.util.Date;
import java.time.LocalDate;

public class Festival {
    private String Ten;
    private String ThoiGian;
    private String DiaDiem;
    // private DiTichLichSu DiTichLienQuan;
    // private SuKienLichSu SuKienLienQuan;
    // private String MoTa;

    public Festival(String ThoiGian, String Ten, String DiaDiem/*
                                                           * , DiTichLichSu DiTichLienQuan, SuKienLichSu SuKienLienQuan,
                                                           * String MoTa
                                                           */) {
        this.Ten = Ten;
        this.ThoiGian = ThoiGian;
        this.DiaDiem = DiaDiem;
        // this.DiTichLienQuan = DiTichLienQuan;
        // this.SuKienLienQuan = SuKienLienQuan;
        // this.MoTa = MoTa;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public void setThoiGian(String ThoiGian) {
        this.ThoiGian = ThoiGian;
    }

    public void setDiaDiem(String DiaDiem) {
        this.DiaDiem = DiaDiem;
    }

    public String getTen() {
        return Ten;
    }

    public String getThoiGian() {
        return ThoiGian;
    }

    public String getDiaDiem() {
        return DiaDiem;
    }
    
}
