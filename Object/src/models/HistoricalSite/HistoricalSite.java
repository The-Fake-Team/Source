package models.HistoricalSite;

import java.util.Date;
import java.time.LocalDate;

public class HistoricalSite {

    private String Name;
    private Date RecognitionDate;
    private String Place;
    private String Summary;
    private String Description;

    public HistoricalSite() {
    }

    public HistoricalSite(String Name, Date RecognitionDate, String Place, String Summary, String Description) {
        this.Name = Name;
        this.RecognitionDate = RecognitionDate;
        this.Place = Place;
        this.Summary = Summary;
        this.Description = Description;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    public void setRecognitionDate(Date RecognitionDate) {
        this.RecognitionDate = RecognitionDate;
    }
    public void setPlace(String Place) {
        this.Place = Place;
    }
    public void setSummary(String Summary) {
        this.Summary = Summary;
    }
    public void setDescription(String Description) {
        this.Description = Description;
    }
    public String getName() {
        return Name;
    }
    public Date getRecognitionDate() {
        return RecognitionDate;
    }
    public String getPlace() {
        return Place;
    }
    public String getSummary() {
        return Summary;
    }
    public String getDescription() {
        return Description;
    }

    public void show()
    {
        System.out.println("Name: " + Name);
        System.out.println("Recognition Date: " + RecognitionDate);
        System.out.println("Place: " + Place);
        System.out.println("Summary: " + Summary);
        System.out.println("Description: " + Description);
    }
}
