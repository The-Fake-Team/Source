package models.HistoricalFigure;

import java.util.Date;
import models.HistoricalPeriod.HistoricalPeriod;

public class HistoricalFigure {
    private String Name;
    private String OtherName;
    private int BirthYear;
    private int DeathYear;
    private String BirthPlace;
    private String Description;
    private HistoricalPeriod period;

    public HistoricalFigure()
    {}
    public HistoricalFigure(String Name, String OtherName, int BirthYear, int DeathYear, String BirthPlace, String Description, HistoricalPeriod period)
    {
        this.Name = Name;
        this.OtherName = OtherName;
        this.BirthYear = BirthYear;
        this.DeathYear = DeathYear;
        this.BirthPlace = BirthPlace;
        this.Description = Description;
        this.period = period;
    }
    public void setName(String Name)
    {
        this.Name = Name;
    }
    public void setOtherName(String OtherName)
    {
        this.OtherName = OtherName;
    }
    public void setBirthYear(int BirthYear)
    {
        this.BirthYear = BirthYear;
    }
    public void setDeathYear(int DeathYear)
    {
        this.DeathYear = DeathYear;
    }
    public void setBirthPlace(String BirthPlace)
    {
        this.BirthPlace = BirthPlace;
    }
    public void setDescription(String Description)
    {
        this.Description = Description;
    }
    public void setPeriod(HistoricalPeriod period)
    {
        this.period = period;
    }
    public String getName()
    {
        return Name;
    }
    public String getOtherName()
    {
        return OtherName;
    }
    public int getBirthYear()
    {
        return BirthYear;
    }
    public int getDeathYear()
    {
        return DeathYear;
    }
    public String getBirthPlace()
    {
        return BirthPlace;
    }
    public String getDescription()
    {
        return Description;
    }
    public HistoricalPeriod getPeriod()
    {
        return period;
    }
    public void show()
    {
        System.out.println("Name: " + Name);
        System.out.println("Other Name: " + OtherName);
        System.out.println("Birth Year: " + BirthYear);
        System.out.println("Death Year: " + DeathYear);
        System.out.println("Birth Place: " + BirthPlace);
        System.out.println("Description: " + Description);
        System.out.println("Period: " + period.getName());
    }

    
}
