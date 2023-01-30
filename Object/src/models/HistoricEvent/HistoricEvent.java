package models.HistoricEvent;

import java.util.ArrayList;
import java.util.List;
import models.HistoricalFigure.*;
import models.HistoricalPeriod.HistoricalPeriod;

import java.util.Date;
import java.time.LocalDate;

public class HistoricEvent<T> {
    private String Name;
    private int StartTime;
    private int EndTime;
    private String Reference;
    private String Description;
    private String RelatedSites;
    private ArrayList<T> RelatedFigures = new ArrayList<T>();

    public HistoricEvent() {
    }

    public HistoricEvent(String Name, int StartTime, int EndTime, String Reference, String Description,
            String RelatedSites) {
        this.Name = Name;
        this.StartTime = StartTime;
        this.EndTime = EndTime;
        this.Reference = Reference;
        this.Description = Description;
        this.RelatedSites = RelatedSites;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setStartTime(int StartTime) {
        this.StartTime = StartTime;
    }

    public void setEndTime(int EndTime) {
        this.EndTime = EndTime;
    }

    public void setReference(String Reference) {
        this.Reference = Reference;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public void setRelatedFigures(ArrayList<T> RelatedFigures) {
        this.RelatedFigures = RelatedFigures;
    }

    public String getName() {
        return Name;
    }

    public int getStartTime() {
        return StartTime;
    }

    public int getEndTime() {
        return EndTime;
    }

    public String getReference() {
        return Reference;
    }

    public String getDescription() {
        return Description;
    }

    public String getRelatedSites() {
        return RelatedSites;
    }

    public ArrayList<T> getRelatedFigures() {
        return RelatedFigures;
    }

    public void addRelatedFigure(T RelatedFigure) {
        RelatedFigures.add(RelatedFigure);
    }

    public void removeRelatedFigure(T RelatedFigure) {
        RelatedFigures.remove(RelatedFigure);
    }

}
