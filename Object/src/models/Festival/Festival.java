package models.Festival;

import java.util.Date;
import java.time.LocalDate;

public class Festival {
    private String Ten;
    private Date ThoiGian;
    private String DiaDiem;

    public Festival(String Ten, Date ThoiGian, String DiaDiem) {
        this.Ten = Ten;
        this.ThoiGian = ThoiGian;
        this.DiaDiem = DiaDiem;
    }

    public String getTen() {
        return Ten;
    }

    public Date getThoiGian() {
        return ThoiGian;
    }

    public String getDiaDiem() {
        return DiaDiem;
    }

    public void setTen() {
        this.Ten = Ten;
    }

    public void setThoiGian() {
        this.ThoiGian = ThoiGian;
    }

    public void setDiaDiem() {
        this.DiaDiem = DiaDiem;
    }

}
