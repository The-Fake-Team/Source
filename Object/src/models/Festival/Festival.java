package models.Festival;

import java.util.ArrayList;
import java.util.Date;

import models.HistoricalFigure.HistoricalFigure;

import java.time.LocalDate;

public class Festival<T> {
    private String Name;
    private Date Date;
    private String Place;
    private String FirstHeldYear;
    private ArrayList<T> RelatedCharacters = new ArrayList<T>();

    public Festival() {
    }
    public Festival(String Name, Date Date, String Place, String FirstHeldYear, ArrayList<T> RelatedCharacters) {
        this.Name = Name;
        this.Date = Date;
        this.Place = Place;
        this.FirstHeldYear = FirstHeldYear;
        this.RelatedCharacters = RelatedCharacters;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    public void setDate(Date Date) {
        this.Date = Date;
    }
    public void setPlace(String Place) {
        this.Place = Place;
    }
    public void setFirstHeldYear(String FirstHeldYear) {
        this.FirstHeldYear = FirstHeldYear;
    }
    public void setRelatedCharacters(ArrayList<T> RelatedCharacters) {
        this.RelatedCharacters = RelatedCharacters;
    }
    public String getName() {
        return Name;
    }
    public Date getDate() {
        return Date;
    }
    public String getPlace() {
        return Place;
    }
    public String getFirstHeldYear() {
        return FirstHeldYear;
    }
    public ArrayList<T> getRelatedCharacters() {
        return RelatedCharacters;
    }
    public void addRelatedCharacter(T RelatedCharacter) {
        RelatedCharacters.add(RelatedCharacter);
    }
    public void removeRelatedCharacter(T RelatedCharacter) {
        RelatedCharacters.remove(RelatedCharacter);
    }
    public void printRelatedCharacters() {
        for (T RelatedCharacter : RelatedCharacters) {
            System.out.println(RelatedCharacter);
        }
    }
    
}
