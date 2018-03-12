package ru.titus.model.sportradar;

public class TeamsForm {
    private long matchid;
    private String home;
    private String homeMediumName;
    private String homeForm;
    private long homeTeamid;
    private String away;
    private String awayMediumName;
    private String awayForm;
    private long awayTeamid;

    public long getMatchid() {
        return matchid;
    }

    public void setMatchid(long matchid) {
        this.matchid = matchid;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getHomeMediumName() {
        return homeMediumName;
    }

    public void setHomeMediumName(String homeMediumName) {
        this.homeMediumName = homeMediumName;
    }

    public String getHomeForm() {
        return homeForm;
    }

    public void setHomeForm(String homeForm) {
        this.homeForm = homeForm;
    }

    public String getAway() {
        return away;
    }

    public void setAway(String away) {
        this.away = away;
    }

    public String getAwayMediumName() {
        return awayMediumName;
    }

    public void setAwayMediumName(String awayMediumName) {
        this.awayMediumName = awayMediumName;
    }

    public String getAwayForm() {
        return awayForm;
    }

    public void setAwayForm(String awayForm) {
        this.awayForm = awayForm;
    }

    public long getHomeTeamid() {
        return homeTeamid;
    }

    public void setHomeTeamid(long homeTeamid) {
        this.homeTeamid = homeTeamid;
    }

    public long getAwayTeamid() {
        return awayTeamid;
    }

    public void setAwayTeamid(long awayTeamid) {
        this.awayTeamid = awayTeamid;
    }
}
