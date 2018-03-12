package ru.titus.storage.mysql;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import ru.titus.model.sportradar.MatchInfo;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;


public interface MatchInfoRepository extends CrudRepository<MatchInfo, Long> {
    List<MatchInfo> findByMatchid(long matchid);

    @Query("select mi from MatchInfo mi where mi.matchid = :matchid")
    Stream<MatchInfo> findByMatchidReturnStream(@Param("matchid") long matchid);

    @Query("select mi from MatchInfo mi where mi.crawlParamQuantity > :crawl and mi.homeIsCountry = :homeis")
    List<MatchInfo> findByCrawlParamAndHomeIsCountry(@Param("crawl") int crawlParamCount, @Param("homeis") String homeIsCountry);

}
