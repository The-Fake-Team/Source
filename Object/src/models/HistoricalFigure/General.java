package models.HistoricalFigure;

import models.HistoricalPeriod.*;
import java.util.Date;

public class General extends HistoricalFigure {

    public General(String Name, String OtherName, int BirthYear, int DeathYear, String BirthPlace, String Description,
            HistoricalPeriod period) {
        super(Name, OtherName, BirthYear, DeathYear, BirthPlace, Description, period);
    }

}