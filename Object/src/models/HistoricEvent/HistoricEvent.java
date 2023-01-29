package models.HistoricEvent;

import java.util.ArrayList;
import java.util.List;
import models.HistoricalFigure.*;
import models.HistoricalPeriod.HistoricalPeriod;

import java.util.Date;
import java.time.LocalDate;

public class HistoricEvent<T> {
    private String Name;
    private int Start;
    private int End;
    private String Reference;
    private String Detail;
    private ArrayList<String> RelatedSites = new ArrayList<String>();
    private ArrayList<T> RelatedFigures = new ArrayList<T>();

    public HistoricEvent() {
    }

    public HistoricEvent(String Name, int Start, int End, String Reference, String Detail,
            ArrayList<String> RelatedSites, ArrayList<T> RelatedFigures) {
        this.Name = Name;
        this.Start = Start;
        this.End = End;
        this.Reference = Reference;
        this.Detail = Detail;
        this.RelatedSites = RelatedSites;
        this.RelatedFigures = RelatedFigures;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setStart(int Start) {
        this.Start = Start;
    }

    public void setEnd(int End) {
        this.End = End;
    }

    public void setReference(String Reference) {
        this.Reference = Reference;
    }

    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    public void setRelatedSites(ArrayList<String> RelatedSites) {
        this.RelatedSites = RelatedSites;
    }

    public void setRelatedFigures(ArrayList<T> RelatedFigures) {
        this.RelatedFigures = RelatedFigures;
    }

    public String getName() {
        return Name;
    }

    public int getStart() {
        return Start;
    }

    public int getEnd() {
        return End;
    }

    public String getReference() {
        return Reference;
    }

    public String getDetail() {
        return Detail;
    }

    public ArrayList<String> getRelatedSites() {
        return RelatedSites;
    }

    public ArrayList<T> getRelatedFigures() {
        return RelatedFigures;
    }

    public void addRelatedSite(String RelatedSite) {
        RelatedSites.add(RelatedSite);
    }

    public void removeRelatedSite(String RelatedSite) {
        RelatedSites.remove(RelatedSite);
    }

    public void addRelatedFigure(T RelatedFigure) {
        RelatedFigures.add(RelatedFigure);
    }

    public void removeRelatedFigure(T RelatedFigure) {
        RelatedFigures.remove(RelatedFigure);
    }

}
