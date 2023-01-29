package models.HistoricalSite;
import java.util.Date;
import java.time.LocalDate;

public class HistoricalSite {
    
    private String Name;
    private Date recognitionDate;
    private String Place;
    private String Description;

    public HistoricalSite() {
    }
    public HistoricalSite(String Name, Date recognitionDate, String Place, String Description) {
        this.Name = Name;
        this.recognitionDate = recognitionDate;
        this.Place = Place;
        this.Description = Description;
    }


}

