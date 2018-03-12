package ru.titus.model.sportradar;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.titus.model.datafeed.MatchOdd;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static javax.persistence.CascadeType.ALL;

@Entity
@Table(name = "match_info", schema = "matches_stats", catalog = "")
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MatchInfo {
    private Timestamp requestTime;
    private Long matchid;
    private String localDerby;
    private String sex;
    private String home;
    private long homeTeamid;
    private String homeMediumName;
    private String homeForm;
    private String away;
    private long awayTeamid;
    private String awayMediumName;
    private String awayForm;
    private int mergeScore;
    private Integer weather;
    private Integer pitchCondition;
    private String temperature;
    private String wind;
    private Integer windAdvantage;
    private Integer stadiumid;
    private String stadiumName;
    private String stadiumUrl;
    private String stadiumCity;
    private String stadiumCountry;
    private Integer stadiumCapacity;
    private String tournamentSeasonTypeName;
    private String tournamentName;
    private Integer tournamentid;
    private String stadiumGoogleCoords;
    private Integer stadiumConstYear;
    private String crawlParam;
    private Integer crawlParamQuantity;

    private long seasonid;
    private long liveTable;
    private String seasonType;
    private String groupName;
    private String ground;
    private String friendly;
    private String roundByRound;
    private long tournamentLevelOrder;
    private String tournamentLevelName;

    private String matchDate;
    private long matchDateUts;
    private Integer round;
    private Integer week;
    private Integer realCategoryid;
    private String realCategoryName;
    private String homeIsCountry;
    private String homeCountryName;
    private Integer homeCountryid;
    private long homeCountryPopulation;
    private Integer homeContinentid;
    private String homeContinentName;
    private String awayIsCountry;
    private String awayCountryName;
    private Integer awayCountryid;
    private Integer awayContinentid;
    private String awayContinentName;
    private long awayCountryPopulation;

    private Integer lineup;
    private Integer formations;
    private String ballSpotting;
    private String cornersOnly;
    private String multicast;
    private Integer scoutMatch;
    private Integer scoutCoverageStatus;
    private String scoutConnected;
    private String liveOdds;
    private String deeperCoverage;
    private String tacticalLineup;
    private String basicLineup;
    private String hasStats;
    private String inLiveScore;
    private String advantage;
    private String tieBreak;
    private Integer penaltyShootout;
    private String scoutTst;
    private Integer lmtSupport;
    private String venue;
    private String matchdataComplete;
    private String mediaCoverage;

    private Integer homeScore;
    private Integer awayScore;
    private Integer p1HomeScore;
    private Integer p1AwayScore;
    private String winner;
    private Integer distance;
    private long refereeid;
    private String refereeName;
    private List<MatchDetails> matchDetails;

      public MatchInfo (){
    }

    @OneToMany(mappedBy = "matchInfo")
    private List<MatchDetails> getMatchDetails() {
        return matchDetails;
    }

    private void setMatchDetails(List<MatchDetails> matchDetails) {
        this.matchDetails = matchDetails;
    }

    @Basic
    @Column(name = "request_time")
    public Timestamp getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Timestamp requestTime) {
        this.requestTime = requestTime;
    }

    @Id
    @Basic
    @Column(name = "matchid")
    public Long getMatchid() {
        return matchid;
    }

    public void setMatchid(Long matchid) {
        this.matchid = matchid;
    }

    @Basic
    @Column(name = "localDerby")
    public String getLocalDerby() {
        return localDerby;
    }

    public void setLocalDerby(String localDerby) {
        this.localDerby = localDerby;
    }

    @Basic
    @Column(name = "sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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
    @Column(name = "homeTeamid")
    public Long getHomeTeamid() {
        return homeTeamid;
    }

    public void setHomeTeamid(Long homeTeamid) {
        this.homeTeamid = homeTeamid;
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
    @Column(name = "away")
    public String getAway() {
        return away;
    }

    public void setAway(String away) {
        this.away = away;
    }

    @Basic
    @Column(name = "awayTeamid")
    public Long getAwayTeamid() {
        return awayTeamid;
    }

    public void setAwayTeamid(Long awayTeamid) {
        this.awayTeamid = awayTeamid;
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
    @Column(name = "mergeScore")
    public int getMergeScore() {
        return mergeScore;
    }

    public void setMergeScore(int mergeScore) {
        this.mergeScore = mergeScore;
    }

    @Basic
    @Column(name = "weather")
    public Integer getWeather() {
        return weather;
    }

    public void setWeather(Integer weather) {
        this.weather = weather;
    }

    @Basic
    @Column(name = "pitchCondition")
    public Integer getPitchCondition() {
        return pitchCondition;
    }

    public void setPitchCondition(Integer pitchCondition) {
        this.pitchCondition = pitchCondition;
    }

    @Basic
    @Column(name = "temperature")
    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    @Basic
    @Column(name = "wind")
    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    @Basic
    @Column(name = "windAdvantage")
    public Integer getWindAdvantage() {
        return windAdvantage;
    }

    public void setWindAdvantage(Integer windAdvantage) {
        this.windAdvantage = windAdvantage;
    }

    @Basic
    @Column(name = "stadiumid")
    public Integer getStadiumid() {
        return stadiumid;
    }

    public void setStadiumid(Integer stadiumid) {
        this.stadiumid = stadiumid;
    }

    @Basic
    @Column(name = "stadiumName")
    public String getStadiumName() {
        return stadiumName;
    }

    public void setStadiumName(String stadiumName) {
        this.stadiumName = stadiumName;
    }

    @Basic
    @Column(name = "stadiumUrl")
    public String getStadiumUrl() {
        return stadiumUrl;
    }

    public void setStadiumUrl(String stadiumUrl) {
        this.stadiumUrl = stadiumUrl;
    }

    @Basic
    @Column(name = "stadiumCity")
    public String getStadiumCity() {
        return stadiumCity;
    }

    public void setStadiumCity(String stadiumCity) {
        this.stadiumCity = stadiumCity;
    }

    @Basic
    @Column(name = "stadiumCountry")
    public String getStadiumCountry() {
        return stadiumCountry;
    }

    public void setStadiumCountry(String stadiumCountry) {
        this.stadiumCountry = stadiumCountry;
    }

    @Basic
    @Column(name = "stadiumCapacity")
    public Integer getStadiumCapacity() {
        return stadiumCapacity;
    }

    public void setStadiumCapacity(Integer stadiumCapacity) {
        this.stadiumCapacity = stadiumCapacity;
    }

    @Basic
    @Column(name = "tournamentSeasonTypeName")
    public String getTournamentSeasonTypeName() {
        return tournamentSeasonTypeName;
    }

    public void setTournamentSeasonTypeName(String tournamentSeasonTypeName) { this.tournamentSeasonTypeName = tournamentSeasonTypeName;
    }

    @Basic
    @Column(name = "tournamentName")
    public String getTournamentName() {
        return tournamentName;
    }

    public void setTournamentName(String tournamentName) {
        this.tournamentName = tournamentName;
    }

    @Basic
    @Column(name = "tournamentid")
    public Integer getTournamentid() {
        return tournamentid;
    }

    public void setTournamentid(Integer tournamentid) {
        this.tournamentid = tournamentid;
    }

    @Basic
    @Column(name = "stadiumGoogleCoords")
    public String getStadiumGoogleCoords() {
        return stadiumGoogleCoords;
    }

    public void setStadiumGoogleCoords(String stadiumGoogleCoords) {
        this.stadiumGoogleCoords = stadiumGoogleCoords;
    }

    @Basic
    @Column(name = "stadiumConstYear")
    public Integer getStadiumConstYear() {
        return stadiumConstYear;
    }

    public void setStadiumConstYear(Integer stadiumConstYear) {
        this.stadiumConstYear = stadiumConstYear;
    }

    @Basic
    @Column(name = "homeForm")
    public String getHomeForm() {
        return homeForm;
    }

    public void setHomeForm(String homeForm) {
        this.homeForm = homeForm;
    }

    @Basic
    @Column(name = "awayForm")
    public String getAwayForm() {
        return awayForm;
    }

    public void setAwayForm(String awayForm) {
        this.awayForm = awayForm;
    }

    @Basic
    @Column(name = "crawlParam")
    public String getCrawlParam() {
        return crawlParam;
    }

    public void setCrawlParam(String crawlParam) {
        this.crawlParam = crawlParam;
    }

    @Basic
    @Column(name = "crawlParamQuantity")
    public Integer getCrawlParamQuantity() {
        return crawlParamQuantity;
    }

    public void setCrawlParamQuantity(Integer crawlParamQuantity) {
        this.crawlParamQuantity = crawlParamQuantity;
    }

    public long getSeasonid() {
        return seasonid;
    }

    public void setSeasonid(long seasonid) {
        this.seasonid = seasonid;
    }

    public long getLiveTable() {
        return liveTable;
    }

    public void setLiveTable(long liveTable) {
        this.liveTable = liveTable;
    }

    public String getSeasonType() {
        return seasonType;
    }

    public void setSeasonType(String seasonType) {
        this.seasonType = seasonType;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGround() {
        return ground;
    }

    public void setGround(String ground) {
        this.ground = ground;
    }

    public String getFriendly() {
        return friendly;
    }

    public void setFriendly(String friendly) {
        this.friendly = friendly;
    }

    public String getRoundByRound() {
        return roundByRound;
    }

    public void setRoundByRound(String roundByRound) {
        this.roundByRound = roundByRound;
    }

    public long getTournamentLevelOrder() {
        return tournamentLevelOrder;
    }

    public void setTournamentLevelOrder(long tournamentLevelOrder) {
        this.tournamentLevelOrder = tournamentLevelOrder;
    }

    public String getTournamentLevelName() {
        return tournamentLevelName;
    }

    public void setTournamentLevelName(String tournamentLevelName) {
        this.tournamentLevelName = tournamentLevelName;
    }

    public String getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(String matchDate) {
        this.matchDate = matchDate;
    }

    public Long getMatchDateUts() {
        return matchDateUts;
    }

    public void setMatchDateUts(Long matchDateUts) {
        this.matchDateUts = matchDateUts;
    }

    public Integer getRound() {
        return round;
    }

    public void setRound(Integer round) {
        this.round = round;
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public Integer getRealCategoryid() {
        return realCategoryid;
    }

    public void setRealCategoryid(Integer realCategoryid) {
        this.realCategoryid = realCategoryid;
    }

    public String getRealCategoryName() {
        return realCategoryName;
    }

    public void setRealCategoryName(String realCategoryName) {
        this.realCategoryName = realCategoryName;
    }

    public String getHomeIsCountry() {
        return homeIsCountry;
    }

    public void setHomeIsCountry(String homeIsCountry) {
        this.homeIsCountry = homeIsCountry;
    }

    public String getHomeCountryName() {
        return homeCountryName;
    }

    public void setHomeCountryName(String homeCountryName) {
        this.homeCountryName = homeCountryName;
    }

    public Integer getHomeCountryid() {
        return homeCountryid;
    }

    public void setHomeCountryid(Integer homeCountryCode) {
        this.homeCountryid = homeCountryCode;
    }

    public Long getHomeCountryPopulation() {
        return homeCountryPopulation;
    }

    public void setHomeCountryPopulation(Long homeCountryPopulation) {
        this.homeCountryPopulation = homeCountryPopulation;
    }

    public Integer getHomeContinentid() {
        return homeContinentid;
    }

    public void setHomeContinentid(Integer homeContinentid) {
        this.homeContinentid = homeContinentid;
    }

    public String getHomeContinentName() {
        return homeContinentName;
    }

    public void setHomeContinentName(String homeContinentName) {
        this.homeContinentName = homeContinentName;
    }

    public String getAwayIsCountry() {
        return awayIsCountry;
    }

    public void setAwayIsCountry(String awayIsCountry) {
        this.awayIsCountry = awayIsCountry;
    }

    public String getAwayCountryName() {
        return awayCountryName;
    }

    public void setAwayCountryName(String awayCountryName) {
        this.awayCountryName = awayCountryName;
    }

    public Integer getAwayCountryid() {
        return awayCountryid;
    }

    public void setAwayCountryid(Integer awayCountryCode) {
        this.awayCountryid = awayCountryCode;
    }

    public Integer getAwayContinentid() {
        return awayContinentid;
    }

    public void setAwayContinentid(Integer awayContinentid) {
        this.awayContinentid = awayContinentid;
    }

    public String getAwayContinentName() {
        return awayContinentName;
    }

    public void setAwayContinentName(String awayContinentName) {
        this.awayContinentName = awayContinentName;
    }

    public Long getAwayCountryPopulation() {
        return awayCountryPopulation;
    }

    public void setAwayCountryPopulation(Long awayCountryPopulation) {
        this.awayCountryPopulation = awayCountryPopulation;
    }

    public void setMatchDateUts(long matchDateUts) {
        this.matchDateUts = matchDateUts;
    }

    public void setHomeCountryPopulation(long homeCountryPopulation) {
        this.homeCountryPopulation = homeCountryPopulation;
    }

    public void setAwayCountryPopulation(long awayCountryPopulation) {
        this.awayCountryPopulation = awayCountryPopulation;
    }

    public Integer getLineup() {
        return lineup;
    }

    public void setLineup(Integer lineup) {
        this.lineup = lineup;
    }

    public Integer getFormations() {
        return formations;
    }

    public void setFormations(Integer formations) {
        this.formations = formations;
    }

    public String getBallSpotting() {
        return ballSpotting;
    }

    public void setBallSpotting(String ballSpotting) {
        this.ballSpotting = ballSpotting;
    }

    public String getCornersOnly() {
        return cornersOnly;
    }

    public void setCornersOnly(String cornersOnly) {
        this.cornersOnly = cornersOnly;
    }

    public String getMulticast() {
        return multicast;
    }

    public void setMulticast(String multicast) {
        this.multicast = multicast;
    }

    public Integer getScoutMatch() {
        return scoutMatch;
    }

    public void setScoutMatch(Integer scoutMatch) {
        this.scoutMatch = scoutMatch;
    }

    public Integer getScoutCoverageStatus() {
        return scoutCoverageStatus;
    }

    public void setScoutCoverageStatus(Integer scoutCoverageStatus) {
        this.scoutCoverageStatus = scoutCoverageStatus;
    }

    public String getScoutConnected() {
        return scoutConnected;
    }

    public void setScoutConnected(String scoutConnected) {
        this.scoutConnected = scoutConnected;
    }

    public String getLiveOdds() {
        return liveOdds;
    }

    public void setLiveOdds(String liveOdds) {
        this.liveOdds = liveOdds;
    }

    public String getDeeperCoverage() {
        return deeperCoverage;
    }

    public void setDeeperCoverage(String deeperCoverage) {
        this.deeperCoverage = deeperCoverage;
    }

    public String getTacticalLineup() {
        return tacticalLineup;
    }

    public void setTacticalLineup(String tacticalLineup) {
        this.tacticalLineup = tacticalLineup;
    }

    public String getBasicLineup() {
        return basicLineup;
    }

    public void setBasicLineup(String basicLineup) {
        this.basicLineup = basicLineup;
    }

    public String getHasStats() {
        return hasStats;
    }

    public void setHasStats(String hasStats) {
        this.hasStats = hasStats;
    }

    public String getInLiveScore() {
        return inLiveScore;
    }

    public void setInLiveScore(String inLiveScore) {
        this.inLiveScore = inLiveScore;
    }

    public String getAdvantage() {
        return advantage;
    }

    public void setAdvantage(String advantage) {
        this.advantage = advantage;
    }

    public String getTieBreak() {
        return tieBreak;
    }

    public void setTieBreak(String tieBreak) {
        this.tieBreak = tieBreak;
    }

    public Integer getPenaltyShootout() {
        return penaltyShootout;
    }

    public void setPenaltyShootout(Integer penaltyShootout) {
        this.penaltyShootout = penaltyShootout;
    }

    public String getScoutTst() {
        return scoutTst;
    }

    public void setScoutTst(String scoutTst) {
        this.scoutTst = scoutTst;
    }

    public Integer getLmtSupport() {
        return lmtSupport;
    }

    public void setLmtSupport(Integer lmtSupport) {
        this.lmtSupport = lmtSupport;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getMatchdataComplete() {
        return matchdataComplete;
    }

    public void setMatchdataComplete(String matchdataComplete) {
        this.matchdataComplete = matchdataComplete;
    }

    public String getMediaCoverage() {
        return mediaCoverage;
    }

    public void setMediaCoverage(String mediaCoverage) {
        this.mediaCoverage = mediaCoverage;
    }

    public Integer getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(Integer homeScore) {
        this.homeScore = homeScore;
    }

    public Integer getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(Integer awayScore) {
        this.awayScore = awayScore;
    }

    public Integer getP1HomeScore() {
        return p1HomeScore;
    }

    public void setP1HomeScore(Integer p1HomeScore) {
        this.p1HomeScore = p1HomeScore;
    }

    public Integer getP1AwayScore() {
        return p1AwayScore;
    }

    public void setP1AwayScore(Integer p1AwayScore) {
        this.p1AwayScore = p1AwayScore;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public long getRefereeid() {
        return refereeid;
    }

    public void setRefereeid(long refereeid) {
        this.refereeid = refereeid;
    }

    public String getRefereeName() {
        return refereeName;
    }

    public void setRefereeName(String refereeName) {
        this.refereeName = refereeName;
    }

}
