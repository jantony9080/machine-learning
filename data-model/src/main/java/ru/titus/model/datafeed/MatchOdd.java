package ru.titus.model.datafeed;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.titus.model.sportradar.MatchDetails;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "match_odd", schema = "matches_stats", catalog = "")
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MatchOdd {
    private long id;
    private long matchDetailid;
    private Timestamp requestTime;
    private int matchid;
    private int duration;
    private Integer oddId;
    private String source;
    private String oddType;
    private String timeType;
    private String lbType;
    private String pivotType;
    private String pivotBias;
    private float pivotValue;
    private String pivotString;
    private String rateUnderUid;
    private float rateUnder;
    private String rateOverUid;
    private float rateOver;
    private String rateEqualUid;
    private float rateEqual;
    private MatchDetails matchDetails;

    public MatchOdd() {
    }

    @ManyToOne
    @JoinColumn(name="match_detailid")
    public MatchDetails getMatchDetails() {
        return matchDetails;
    }

    public void setMatchDetails(MatchDetails matchDetails) {
        this.matchDetails = matchDetails;
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

//    @Basic
//    @Column(name = "match_detailid")
//    public long getMatchDetailid() {
//        return matchDetailid;
//    }
//
//    public void setMatchDetailid(long matchDetailid) {
//        this.matchDetailid = matchDetailid;
//    }

    @Basic
    @Column(name = "requestTime")
    public Timestamp getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Timestamp requestTime) {
        this.requestTime = requestTime;
    }

    @Basic
    @Column(name = "matchid")
    public int getMatchid() {
        return matchid;
    }

    public void setMatchid(int matchid) {
        this.matchid = matchid;
    }

    @Basic
    @Column(name = "duration")
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Basic
    @Column(name = "oddId")
    public Integer getOddId() {
        return oddId;
    }

    public void setOddId(Integer oddId) {
        this.oddId = oddId;
    }

    @Basic
    @Column(name = "source")
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Basic
    @Column(name = "oddType")
    public String getOddType() {
        return oddType;
    }

    public void setOddType(String oddType) {
        this.oddType = oddType;
    }

    @Basic
    @Column(name = "pivotType")
    public String getPivotType() {
        return pivotType;
    }

    public void setPivotType(String pivotType) {
        this.pivotType = pivotType;
    }

    @Basic
    @Column(name = "pivotValue")
    public float getPivotValue() {
        return pivotValue;
    }

    public void setPivotValue(float pivotValue) {
        this.pivotValue = pivotValue;
    }

    @Basic
    @Column(name = "pivotString")
    public String getPivotString() {
        return pivotString;
    }

    public void setPivotString(String pivotString) {
        this.pivotString = pivotString;
    }

    @Basic
    @Column(name = "rateUnderUid")
    public String getRateUnderUid() {
        return rateUnderUid;
    }

    public void setRateUnderUid(String rateUnderUid) {
        this.rateUnderUid = rateUnderUid;
    }

    @Basic
    @Column(name = "rateUnder")
    public float getRateUnder() {
        return rateUnder;
    }

    public void setRateUnder(float rateUnder) {
        this.rateUnder = rateUnder;
    }

    @Basic
    @Column(name = "rateOverUid")
    public String getRateOverUid() {
        return rateOverUid;
    }

    public void setRateOverUid(String rateOverUid) {
        this.rateOverUid = rateOverUid;
    }

    @Basic
    @Column(name = "rateOver")
    public float getRateOver() {
        return rateOver;
    }

    public void setRateOver(float rateOver) {
        this.rateOver = rateOver;
    }

    @Basic
    @Column(name = "rateEqualUid")
    public String getRateEqualUid() {
        return rateEqualUid;
    }

    public void setRateEqualUid(String rateEqualUid) {
        this.rateEqualUid = rateEqualUid;
    }

    @Basic
    @Column(name = "rateEqual")
    public float getRateEqual() {
        return rateEqual;
    }

    public void setRateEqual(float rateEqual) {
        this.rateEqual = rateEqual;
    }
    @Basic
    @Column(name = "timeType")
    public String getTimeType() {
        return timeType;
    }

    public void setTimeType(String timeType) {
        this.timeType = timeType;
    }
    @Basic
    @Column(name = "pivotBias")
    public String getPivotBias() {
        return pivotBias;
    }

    public void setPivotBias(String pivotBias) {
        this.pivotBias = pivotBias;
    }
    @Basic
    @Column(name = "lbType")
    public String getLbType() {
        return lbType;
    }

    public void setLbType(String lbType) {
        this.lbType = lbType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MatchOdd matchOdd = (MatchOdd) o;
        return id == matchOdd.id &&
                Objects.equals(matchDetailid, matchOdd.matchDetailid) &&
                Objects.equals(oddId, matchOdd.oddId) &&
                Objects.equals(source, matchOdd.source) &&
                Objects.equals(oddType, matchOdd.oddType) &&
                Objects.equals(pivotType, matchOdd.pivotType) &&
                Objects.equals(pivotValue, matchOdd.pivotValue) &&
                Objects.equals(pivotString, matchOdd.pivotString) &&
                Objects.equals(rateUnderUid, matchOdd.rateUnderUid) &&
                Objects.equals(rateUnder, matchOdd.rateUnder) &&
                Objects.equals(rateOverUid, matchOdd.rateOverUid) &&
                Objects.equals(rateOver, matchOdd.rateOver) &&
                Objects.equals(rateEqualUid, matchOdd.rateEqualUid) &&
                Objects.equals(rateEqual, matchOdd.rateEqual) &&
                Objects.equals(timeType, matchOdd.timeType) &&
                Objects.equals(pivotBias, matchOdd.pivotBias) &&
                Objects.equals(lbType, matchOdd.lbType);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, matchDetailid, oddId, source, oddType, pivotType, pivotValue, pivotString, rateUnderUid, rateUnder, rateOverUid, rateOver, rateEqualUid, rateEqual, timeType, pivotBias, lbType);
    }
}
