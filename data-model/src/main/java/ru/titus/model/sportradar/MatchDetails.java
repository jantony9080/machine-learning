package ru.titus.model.sportradar;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.titus.model.datafeed.MatchOdd;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.*;

import static javax.persistence.CascadeType.ALL;

@Entity
@Table(name = "match_details", schema = "matches_stats", catalog = "")
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MatchDetails {
    private long id;
    private Timestamp requestTime;
    private Long matchid;
    private String bookHost;
    private String bookGuest;
    private String home;
    private String away;
    private Integer duration;
    private Integer timeMain;
    private Integer timeAdd;
    private Integer scoreHome;
    private Integer scoreAway;
    private Integer rCardsHome;
    private Integer rCardsAway;
    private Integer cornerHome;
    private Integer cornerAway;
    private Integer attackHome;
    private Integer attackAway;
    private Integer dattackHome;
    private Integer dattackAway;
    private Integer saveHome;
    private Integer saveAway;
    private Integer yCardsHome;
    private Integer yCardsAway;
    private Integer substitutionHome;
    private Integer substitutionAway;
    private Integer ballPosHome;
    private Integer ballPosAway;
    private Integer freeKicksHome;
    private Integer freeKicksAway;
    private Integer trowsHome;
    private Integer trowsAway;
    private Integer offsHome;
    private Integer offsAway;
    private Integer ballSafeHome;
    private Integer ballSafeAway;
    private Integer shotsOnHome;
    private Integer shotsOnAway;
    private Integer shotsOffHome;
    private Integer shotsOffAway;
    private Integer goalKicksHome;
    private Integer goalKicksAway;
    private Integer foulsHome;
    private Integer foulsAway;
    private Integer injuriesHome;
    private Integer injuriesAway;
    private Integer goalAttemptsHome;
    private Integer goalAttemptsAway;
    private Integer penaltiesHome;
    private Integer penaltiesAway;
    private Integer shotsBlockedHome;
    private Integer shotsBlockedAway;
    private List<MatchOdd> matchOdds;
    private MatchInfo matchInfo;


    public MatchDetails(){
    }

    @ManyToOne
    @JoinColumn(name = "matchid")
    public MatchInfo getMatchInfo() {
        return matchInfo;
    }

    public void setMatchInfo(MatchInfo matchInfo) {
        this.matchInfo = matchInfo;
    }

    @OneToMany(mappedBy = "matchDetails")
    public List<MatchOdd> getMatchOdds() {
        return matchOdds;
    }

    public void setMatchOdds(List<MatchOdd> matchOdds) {
        this.matchOdds = matchOdds;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "request_time")
    public Timestamp getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Timestamp requestTime) {
        this.requestTime = requestTime;
    }


//    @Column(name = "matchid")
//    public Long getMatchid() {
//        return matchid;
//    }
//
//    public void setMatchid(Long matchid) {
//        this.matchid = matchid;
//    }

    @Basic
    @Column(name = "bookHost")
    public String getBookHost() {
        return bookHost;
    }

    public void setBookHost(String bookHost) {
        this.bookHost = bookHost;
    }
    @Basic
    @Column(name = "bookGuest")
    public String getBookGuest() {
        return bookGuest;
    }

    public void setBookGuest(String bookGuest) {
        this.bookGuest = bookGuest;
    }

    @Basic
    @Column(name = "home")
    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    @Basic
    @Column(name = "away")
    public String getAway() {
        return away;
    }

    public void setAway(String away) {
        this.away = away;
    }

    @Basic
    @Column(name = "duration")
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @Basic
    @Column(name = "scoreHome")
    public Integer getScoreHome() { return scoreHome; }

    public void setScoreHome(Integer scoreHome) { this.scoreHome = scoreHome; }

    @Basic
    @Column(name = "scoreAway")
    public Integer getScoreAway() { return scoreAway; }

    public void setScoreAway(Integer scoreAway) { this.scoreAway = scoreAway; }

    @Basic
    @Column(name = "timeMain")
    public Integer getTimeMain() {
        return timeMain;
    }

    public void setTimeMain(Integer timeMain) {
        this.timeMain = timeMain;
    }

    @Basic
    @Column(name = "timeAdd")
    public Integer getTimeAdd() {
        return timeAdd;
    }

    public void setTimeAdd(Integer timeAdd) {
        this.timeAdd = timeAdd;
    }

    @Basic
    @Column(name = "rCardsHome")
    public Integer getrCardsHome() {
        return rCardsHome;
    }

    public void setrCardsHome(Integer rCardsHome) {
        this.rCardsHome = rCardsHome;
    }

    @Basic
    @Column(name = "rCardsAway")
    public Integer getrCardsAway() {
        return rCardsAway;
    }

    public void setrCardsAway(Integer rCardsAway) {
        this.rCardsAway = rCardsAway;
    }

    @Basic
    @Column(name = "cornerHome")
    public Integer getCornerHome() {
        return cornerHome;
    }

    public void setCornerHome(Integer cornerHome) {
        this.cornerHome = cornerHome;
    }

    @Basic
    @Column(name = "cornerAway")
    public Integer getCornerAway() {
        return cornerAway;
    }

    public void setCornerAway(Integer cornerAway) {
        this.cornerAway = cornerAway;
    }

    @Basic
    @Column(name = "attackHome")
    public Integer getAttackHome() {
        return attackHome;
    }

    public void setAttackHome(Integer attackHome) {
        this.attackHome = attackHome;
    }

    @Basic
    @Column(name = "attackAway")
    public Integer getAttackAway() {
        return attackAway;
    }

    public void setAttackAway(Integer attackAway) {
        this.attackAway = attackAway;
    }

    @Basic
    @Column(name = "dattackHome")
    public Integer getDattackHome() {
        return dattackHome;
    }

    public void setDattackHome(Integer dattackHome) {
        this.dattackHome = dattackHome;
    }

    @Basic
    @Column(name = "dattackAway")
    public Integer getDattackAway() {
        return dattackAway;
    }

    public void setDattackAway(Integer dattackAway) {
        this.dattackAway = dattackAway;
    }

    @Basic
    @Column(name = "saveHome")
    public Integer getSaveHome() {
        return saveHome;
    }

    public void setSaveHome(Integer saveHome) {
        this.saveHome = saveHome;
    }

    @Basic
    @Column(name = "saveAway")
    public Integer getSaveAway() {
        return saveAway;
    }

    public void setSaveAway(Integer saveAway) {
        this.saveAway = saveAway;
    }

    @Basic
    @Column(name = "yCardsHome")
    public Integer getyCardsHome() {
        return yCardsHome;
    }

    public void setyCardsHome(Integer yCardsHome) {
        this.yCardsHome = yCardsHome;
    }

    @Basic
    @Column(name = "yCardsAway")
    public Integer getyCardsAway() {
        return yCardsAway;
    }

    public void setyCardsAway(Integer yCardsAway) {
        this.yCardsAway = yCardsAway;
    }

    @Basic
    @Column(name = "substitutionHome")
    public Integer getSubstitutionHome() {
        return substitutionHome;
    }

    public void setSubstitutionHome(Integer substitutionHome) {
        this.substitutionHome = substitutionHome;
    }

    @Basic
    @Column(name = "substitutionAway")
    public Integer getSubstitutionAway() {
        return substitutionAway;
    }

    public void setSubstitutionAway(Integer substitutionAway) {
        this.substitutionAway = substitutionAway;
    }

    @Basic
    @Column(name = "ballPosHome")
    public Integer getBallPosHome() {
        return ballPosHome;
    }

    public void setBallPosHome(Integer ballPosHome) {
        this.ballPosHome = ballPosHome;
    }

    @Basic
    @Column(name = "ballPosAway")
    public Integer getBallPosAway() {
        return ballPosAway;
    }

    public void setBallPosAway(Integer ballPosAway) {
        this.ballPosAway = ballPosAway;
    }

    @Basic
    @Column(name = "freeKicksHome")
    public Integer getFreeKicksHome() {
        return freeKicksHome;
    }

    public void setFreeKicksHome(Integer freeKicksHome) {
        this.freeKicksHome = freeKicksHome;
    }

    @Basic
    @Column(name = "freeKicksAway")
    public Integer getFreeKicksAway() {
        return freeKicksAway;
    }

    public void setFreeKicksAway(Integer freeKicksAway) {
        this.freeKicksAway = freeKicksAway;
    }

    @Basic
    @Column(name = "trowsHome")
    public Integer getTrowsHome() {
        return trowsHome;
    }

    public void setTrowsHome(Integer trowsHome) {
        this.trowsHome = trowsHome;
    }

    @Basic
    @Column(name = "trowsAway")
    public Integer getTrowsAway() {
        return trowsAway;
    }

    public void setTrowsAway(Integer trowsAway) {
        this.trowsAway = trowsAway;
    }

    @Basic
    @Column(name = "offsHome")
    public Integer getOffsHome() {
        return offsHome;
    }

    public void setOffsHome(Integer offsHome) {
        this.offsHome = offsHome;
    }

    @Basic
    @Column(name = "offsAway")
    public Integer getOffsAway() {
        return offsAway;
    }

    public void setOffsAway(Integer offsAway) {
        this.offsAway = offsAway;
    }

    @Basic
    @Column(name = "ballSafeHome")
    public Integer getBallSafeHome() {
        return ballSafeHome;
    }

    public void setBallSafeHome(Integer ballSafeHome) {
        this.ballSafeHome = ballSafeHome;
    }

    @Basic
    @Column(name = "ballSafeAway")
    public Integer getBallSafeAway() {
        return ballSafeAway;
    }

    public void setBallSafeAway(Integer ballSafeAway) {
        this.ballSafeAway = ballSafeAway;
    }

    @Basic
    @Column(name = "shotsOnHome")
    public Integer getShotsOnHome() {
        return shotsOnHome;
    }

    public void setShotsOnHome(Integer shotsOnHome) {
        this.shotsOnHome = shotsOnHome;
    }

    @Basic
    @Column(name = "shotsOnAway")
    public Integer getShotsOnAway() {
        return shotsOnAway;
    }

    public void setShotsOnAway(Integer shotsOnAway) {
        this.shotsOnAway = shotsOnAway;
    }

    @Basic
    @Column(name = "shotsOffHome")
    public Integer getShotsOffHome() {
        return shotsOffHome;
    }

    public void setShotsOffHome(Integer shotsOffHome) {
        this.shotsOffHome = shotsOffHome;
    }

    @Basic
    @Column(name = "shotsOffAway")
    public Integer getShotsOffAway() {
        return shotsOffAway;
    }

    public void setShotsOffAway(Integer shotsOffAway) {
        this.shotsOffAway = shotsOffAway;
    }

    @Basic
    @Column(name = "goalKicksHome")
    public Integer getGoalKicksHome() {
        return goalKicksHome;
    }

    public void setGoalKicksHome(Integer goalKicksHome) {
        this.goalKicksHome = goalKicksHome;
    }

    @Basic
    @Column(name = "goalKicksAway")
    public Integer getGoalKicksAway() {
        return goalKicksAway;
    }

    public void setGoalKicksAway(Integer goalKicksAway) {
        this.goalKicksAway = goalKicksAway;
    }

    @Basic
    @Column(name = "foulsHome")
    public Integer getFoulsHome() {
        return foulsHome;
    }

    public void setFoulsHome(Integer foulsHome) {
        this.foulsHome = foulsHome;
    }

    @Basic
    @Column(name = "foulsAway")
    public Integer getFoulsAway() {
        return foulsAway;
    }

    public void setFoulsAway(Integer foulsAway) {
        this.foulsAway = foulsAway;
    }

    @Basic
    @Column(name = "injuriesHome")
    public Integer getInjuriesHome() {
        return injuriesHome;
    }

    public void setInjuriesHome(Integer injuriesHome) {
        this.injuriesHome = injuriesHome;
    }

    @Basic
    @Column(name = "injuriesAway")
    public Integer getInjuriesAway() {
        return injuriesAway;
    }

    public void setInjuriesAway(Integer injuriesAway) {
        this.injuriesAway = injuriesAway;
    }

    public Integer getGoalAttemptsHome() {
        return goalAttemptsHome;
    }

    public void setGoalAttemptsHome(Integer goalAttemptsHome) {
        this.goalAttemptsHome = goalAttemptsHome;
    }

    public Integer getGoalAttemptsAway() {
        return goalAttemptsAway;
    }

    public void setGoalAttemptsAway(Integer goalAttemptsAway) {
        this.goalAttemptsAway = goalAttemptsAway;
    }

    public Integer getPenaltiesHome() {
        return penaltiesHome;
    }

    public void setPenaltiesHome(Integer penaltiesHome) {
        this.penaltiesHome = penaltiesHome;
    }

    public Integer getPenaltiesAway() {
        return penaltiesAway;
    }

    public void setPenaltiesAway(Integer penaltiesAway) {
        this.penaltiesAway = penaltiesAway;
    }

    public Integer getShotsBlockedHome() {
        return shotsBlockedHome;
    }

    public void setShotsBlockedHome(Integer shotsBlockedHome) {
        this.shotsBlockedHome = shotsBlockedHome;
    }

    public Integer getShotsBlockedAway() {
        return shotsBlockedAway;
    }

    public void setShotsBlockedAway(Integer shotsBlockedAway) {
        this.shotsBlockedAway = shotsBlockedAway;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MatchDetails that = (MatchDetails) o;
        return id == that.id &&
                Objects.equals(requestTime, that.requestTime) &&
                Objects.equals(matchid, that.matchid) &&
                Objects.equals(bookHost, that.bookHost) &&
                Objects.equals(bookGuest, that.bookGuest) &&
                Objects.equals(home, that.home) &&
                Objects.equals(away, that.away) &&
                Objects.equals(duration, that.duration) &&
                Objects.equals(timeMain, that.timeMain) &&
                Objects.equals(timeAdd, that.timeAdd) &&
                Objects.equals(rCardsHome, that.rCardsHome) &&
                Objects.equals(rCardsAway, that.rCardsAway) &&
                Objects.equals(cornerHome, that.cornerHome) &&
                Objects.equals(cornerAway, that.cornerAway) &&
                Objects.equals(attackHome, that.attackHome) &&
                Objects.equals(attackAway, that.attackAway) &&
                Objects.equals(dattackHome, that.dattackHome) &&
                Objects.equals(dattackAway, that.dattackAway) &&
                Objects.equals(saveHome, that.saveHome) &&
                Objects.equals(saveAway, that.saveAway) &&
                Objects.equals(yCardsHome, that.yCardsHome) &&
                Objects.equals(yCardsAway, that.yCardsAway) &&
                Objects.equals(substitutionHome, that.substitutionHome) &&
                Objects.equals(substitutionAway, that.substitutionAway) &&
                Objects.equals(ballPosHome, that.ballPosHome) &&
                Objects.equals(ballPosAway, that.ballPosAway) &&
                Objects.equals(freeKicksHome, that.freeKicksHome) &&
                Objects.equals(freeKicksAway, that.freeKicksAway) &&
                Objects.equals(trowsHome, that.trowsHome) &&
                Objects.equals(trowsAway, that.trowsAway) &&
                Objects.equals(offsHome, that.offsHome) &&
                Objects.equals(offsAway, that.offsAway) &&
                Objects.equals(ballSafeHome, that.ballSafeHome) &&
                Objects.equals(ballSafeAway, that.ballSafeAway) &&
                Objects.equals(shotsOnHome, that.shotsOnHome) &&
                Objects.equals(shotsOnAway, that.shotsOnAway) &&
                Objects.equals(shotsOffHome, that.shotsOffHome) &&
                Objects.equals(shotsOffAway, that.shotsOffAway) &&
                Objects.equals(goalKicksHome, that.goalKicksHome) &&
                Objects.equals(goalKicksAway, that.goalKicksAway) &&
                Objects.equals(foulsHome, that.foulsHome) &&
                Objects.equals(foulsAway, that.foulsAway) &&
                Objects.equals(injuriesHome, that.injuriesHome) &&
                Objects.equals(injuriesAway, that.injuriesAway);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, requestTime, matchid, bookHost, bookGuest, home, away, duration, timeMain, timeAdd, rCardsHome, rCardsAway, cornerHome, cornerAway, attackHome, attackAway, dattackHome, dattackAway, saveHome, saveAway, yCardsHome, yCardsAway, substitutionHome, substitutionAway, ballPosHome, ballPosAway, freeKicksHome, freeKicksAway, trowsHome, trowsAway, offsHome, offsAway, ballSafeHome, ballSafeAway, shotsOnHome, shotsOnAway, shotsOffHome, shotsOffAway, goalKicksHome, goalKicksAway, foulsHome, foulsAway, injuriesHome, injuriesAway);
    }
}
