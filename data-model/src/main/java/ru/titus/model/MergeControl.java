package ru.titus.model;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MergeControl {

    private int id;
    private int matchid;
    private Timestamp requestDate;
    private int mergeScore;
    private String radarHome;
    private String bookHome;
    private String radarAway;
    private String bookAway;
    private String bookLeague;
    private String radarLeagueCountry;
    private String radarLeagueName;
    private int radarHomeScore;
    private int bookHomeScore;
    private int radarAwayScore;
    private int bookAwayScore;
    private int radarMainTime;
    private int bookDuration;
    private long radarStartTime;
    private long bookStartTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMatchid() {
        return matchid;
    }

    public void setMatchid(int matchid) {
        this.matchid = matchid;
    }

    public Timestamp getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Timestamp requestDate) {
        this.requestDate = requestDate;
    }

    public int getMergeScore() {
        return mergeScore;
    }

    public void setMergeScore(int matchScore) {
        this.mergeScore = matchScore;
    }

    public String getRadarHome() {
        return radarHome;
    }

    public void setRadarHome(String radarHome) {
        this.radarHome = radarHome;
    }

    public String getBookHome() {
        return bookHome;
    }

    public void setBookHome(String bookHome) {
        this.bookHome = bookHome;
    }

    public String getRadarAway() {
        return radarAway;
    }

    public void setRadarAway(String radarAway) {
        this.radarAway = radarAway;
    }

    public String getBookAway() {
        return bookAway;
    }

    public void setBookAway(String bookAway) {
        this.bookAway = bookAway;
    }

    public String getBookLeague() {
        return bookLeague;
    }

    public void setBookLeague(String bookLeague) {
        this.bookLeague = bookLeague;
    }

    public String getRadarLeagueCountry() {
        return radarLeagueCountry;
    }

    public void setRadarLeagueCountry(String radarLeagueCountry) {
        this.radarLeagueCountry = radarLeagueCountry;
    }

    public String getRadarLeagueName() {
        return radarLeagueName;
    }

    public void setRadarLeagueName(String getRadarLeagueName) {
        this.radarLeagueName = getRadarLeagueName;
    }

    public int getRadarHomeScore() {
        return radarHomeScore;
    }

    public void setRadarHomeScore(int radarHomeScore) {
        this.radarHomeScore = radarHomeScore;
    }

    public int getBookHomeScore() {
        return bookHomeScore;
    }

    public void setBookHomeScore(int bookHomeScore) {
        this.bookHomeScore = bookHomeScore;
    }

    public int getRadarAwayScore() {
        return radarAwayScore;
    }

    public void setRadarAwayScore(int radarAwayScore) {
        this.radarAwayScore = radarAwayScore;
    }

    public int getBookAwayScore() {
        return bookAwayScore;
    }

    public void setBookAwayScore(int bookAwayScore) {
        this.bookAwayScore = bookAwayScore;
    }

    public int getRadarMainTime() {
        return radarMainTime;
    }

    public void setRadarMainTime(int radarMainTime) {
        this.radarMainTime = radarMainTime;
    }

    public int getBookDuration() {
        return bookDuration;
    }

    public void setBookDuration(int bookDuration) {
        this.bookDuration = bookDuration;
    }

    public long getRadarStartTime() {
        return radarStartTime;
    }

    public void setRadarStartTime(long radarStartTime) {
        this.radarStartTime = radarStartTime;
    }

    public long getBookStartTime() {
        return bookStartTime;
    }

    public void setBookStartTime(long bookStartTime) {
        this.bookStartTime = bookStartTime;
    }
}
