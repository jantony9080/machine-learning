package ru.titus.model.sportradar;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Event {

    private String leagueCountry;
    private String leagueName;
    private String seasonType;
    private String tournamentLevel;
    private String home;
    private String homeMediumName;
    private String away;
    private String awayMediumName;
    private String timeStart;
    private String dateStart;
    private String tzStart;
    private long uts;
    private int matchid;
    private int mainTime;
    private int additionalTime;
    private String matchStatus;
    private int scoreHome;
    private int scoreAway;

    public Event(){
    }

    public String getLeagueCountry() {
        return leagueCountry;
    }

    public void setLeagueCountry(String leagueCountry) {
        this.leagueCountry = leagueCountry;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public int getMatchid() {
        return matchid;
    }

    public void setMatchid(int matchid) {
        this.matchid = matchid;
    }

    public int getMainTime() {
        return mainTime;
    }

    public void setMainTime(int mainTime) {
        this.mainTime = mainTime;
    }

    public int getAdditionalTime() {
        return additionalTime;
    }

    public void setAdditionalTime(int additionalTime) {
        this.additionalTime = additionalTime;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getAway() {
        return away;
    }

    public void setAway(String away) {
        this.away = away;
    }

    public int getScoreHome() {
        return scoreHome;
    }

    public void setScoreHome(int scoreHome) {
        this.scoreHome = scoreHome;
    }

    public int getScoreAway() {
        return scoreAway;
    }

    public void setScoreAway(int scoreAway) {
        this.scoreAway = scoreAway;
    }

    public String getSeasonType() {
        return seasonType;
    }

    public void setSeasonType(String seasonType) {
        this.seasonType = seasonType;
    }

    public String getTournamentLevel() {
        return tournamentLevel;
    }

    public void setTournamentLevel(String tournamentLevel) {
        this.tournamentLevel = tournamentLevel;
    }

    public String getHomeMediumName() {
        return homeMediumName;
    }

    public void setHomeMediumName(String homeMediumName) {
        this.homeMediumName = homeMediumName;
    }

    public String getAwayMediumName() {
        return awayMediumName;
    }

    public void setAwayMediumName(String awayMediumName) {
        this.awayMediumName = awayMediumName;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getTzStart() {
        return tzStart;
    }

    public void setTzStart(String tzStart) {
        this.tzStart = tzStart;
    }

    public String getStatus() {
        return matchStatus;
    }

    public void setStatus(String status) {
        this.matchStatus = status;
    }

    public long getUts() {
        return uts;
    }

    public void setUts(long uts) {
        this.uts = uts;
    }

    public String getMatchStatus() {
        return matchStatus;
    }

    public void setMatchStatus(String matchStatus) {
        this.matchStatus = matchStatus;
    }
}
