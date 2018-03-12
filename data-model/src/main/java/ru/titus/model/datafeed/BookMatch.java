package ru.titus.model.datafeed;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BookMatch {
    private String bookId;
    private int matchid;
    private String league;
    private String host;
    private String guest;
    private int mergeScore;
    private long startTime;
    private int duration;
    private int mainTime;
    private int additionalTime;
    private int scoreHome;
    private int scoreAway;
    private List<MatchOdd> matchOdds = new ArrayList<>();

    public void addMatchOdd(MatchOdd newMatchOdd){
        matchOdds.add(newMatchOdd);
    }


    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public int getMatchid() {
        return matchid;
    }

    public void setMatchid(int matchid) {
        this.matchid = matchid;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }

    public int getMergeScore() {
        return mergeScore;
    }

    public void setMergeScore(int mergeScore) {
        this.mergeScore = mergeScore;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
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

    public List<MatchOdd> getMatchOdds() {
        return matchOdds;
    }

    public void setMatchOdds(List<MatchOdd> matchOdds) {
        this.matchOdds = matchOdds;
    }
}


