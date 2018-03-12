package ru.titus.model.sportradar;

import javax.persistence.*;

@Entity
@Table(name = "soccer_match", schema = "matches_stats", catalog = "")
public class SoccerMatch {
//    private long id;
    private Long matchid;
    private String matchDate;
    private long matchUts;
    private Integer round;
    private String roundName;
    private Integer cupRoundMatchNumber;
    private Integer cupRoundNumberofMatches;
    private Integer weekValue;
    private Long seasonid;
    private String neutralGround;
    private Long stadiumid;
    private Integer homeid;
    private String homeName;
    private String homeMediumName;
    private Integer awayid;
    private String awayName;
    private String awayMediumName;
    private Integer homeScore;
    private Integer awayScore;
    private String resultPeriod;
    private String winner;

//    @Id
//    @Column(name = "id")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }

    @Id
    @Column(name = "matchid")
    public Long getMatchid() {
        return matchid;
    }

    public void setMatchid(Long matchid) {
        this.matchid = matchid;
    }

    @Basic
    @Column(name = "matchDate")
    public String getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(String matchDate) {
        this.matchDate = matchDate;
    }

    @Basic
    @Column(name = "matchUts")
    public Long getMatchUts() {
        return matchUts;
    }

    public void setMatchUts(Long matchUts) {
        this.matchUts = matchUts;
    }

    @Basic
    @Column(name = "round")
    public Integer getRound() {
        return round;
    }

    public void setRound(Integer round) {
        this.round = round;
    }

    @Basic
    @Column(name = "roundName")
    public String getRoundName() {
        return roundName;
    }

    public void setRoundName(String roundName) {
        this.roundName = roundName;
    }

    @Basic
    @Column(name = "cupRoundMatchNumber")
    public Integer getCupRoundMatchNumber() {
        return cupRoundMatchNumber;
    }

    public void setCupRoundMatchNumber(Integer cupRoundMatchNumber) {
        this.cupRoundMatchNumber = cupRoundMatchNumber;
    }

    @Basic
    @Column(name = "cupRoundNumberofMatches")
    public Integer getCupRoundNumberofMatches() {
        return cupRoundNumberofMatches;
    }

    public void setCupRoundNumberofMatches(Integer cupRoundNumberofMatches) {
        this.cupRoundNumberofMatches = cupRoundNumberofMatches;
    }

    @Basic
    @Column(name = "weekValue")
    public Integer getWeekValue() {
        return weekValue;
    }

    public void setWeekValue(Integer week) {
        this.weekValue = week;
    }

    @Basic
    @Column(name = "seasonid")
    public Long getSeasonid() {
        return seasonid;
    }

    public void setSeasonid(Long seasonid) {
        this.seasonid = seasonid;
    }

    @Basic
    @Column(name = "neutral_ground")
    public String getNeutralGround() {
        return neutralGround;
    }

    public void setNeutralGround(String neutralGround) {
        this.neutralGround = neutralGround;
    }

    @Basic
    @Column(name = "stadiumid")
    public Long getStadiumid() {
        return stadiumid;
    }

    public void setStadiumid(Long stadiumid) {
        this.stadiumid = stadiumid;
    }

    @Basic
    @Column(name = "homeid")
    public Integer getHomeid() {
        return homeid;
    }

    public void setHomeid(Integer homeid) {
        this.homeid = homeid;
    }

    @Basic
    @Column(name = "homeName")
    public String getHomeName() {
        return homeName;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName;
    }

    @Basic
    @Column(name = "homeMediumName")
    public String getHomeMediumName() {
        return homeMediumName;
    }

    public void setHomeMediumName(String homeMediumName) {
        this.homeMediumName = homeMediumName;
    }

    @Basic
    @Column(name = "awayid")
    public Integer getAwayid() {
        return awayid;
    }

    public void setAwayid(Integer awayid) {
        this.awayid = awayid;
    }

    @Basic
    @Column(name = "awayName")
    public String getAwayName() {
        return awayName;
    }

    public void setAwayName(String awayName) {
        this.awayName = awayName;
    }

    @Basic
    @Column(name = "awayMediumName")
    public String getAwayMediumName() {
        return awayMediumName;
    }

    public void setAwayMediumName(String awayMediumName) {
        this.awayMediumName = awayMediumName;
    }

    @Basic
    @Column(name = "homeScore")
    public Integer getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(Integer homeScore) {
        this.homeScore = homeScore;
    }

    @Basic
    @Column(name = "awayScore")
    public Integer getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(Integer awayScore) {
        this.awayScore = awayScore;
    }

    @Basic
    @Column(name = "resultPeriod")
    public String getResultPeriod() {
        return resultPeriod;
    }

    public void setResultPeriod(String resultPeriod) {
        this.resultPeriod = resultPeriod;
    }

    @Basic
    @Column(name = "winner")
    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

}
