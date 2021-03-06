package ru.titus.manager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.titus.model.sportradar.MatchDetails;
import ru.titus.model.sportradar.MatchInfo;
import ru.titus.storage.mysql.MatchDetailsRepository;
import ru.titus.storage.mysql.MatchInfoRepository;
import ru.titus.storage.mysql.MatchOddsRepository;
import ru.titus.storage.mysql.SoccerMatchRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DataCollector {

    @Autowired
    private MatchInfoRepository matchInfoRepository;
    @Autowired
    private MatchDetailsRepository matchDetailsRepository;
    @Autowired
    private MatchOddsRepository matchOddsRepository;
    @Autowired
    private SoccerMatchRepository soccerMatchRepository;

    public void collectMatchOdds(){
//       List<MatchDetails> matchDetails = (List<MatchDetails>) matchDetailsRepository.findAll();
//       Optional<MatchDetails> matchDetail = matchDetailsRepository.findById( (long) 1 );
//       Optional<MatchInfo> matchInfo = matchInfoRepository.findById((long)11947822);

       List<MatchInfo> matchInfoList = matchInfoRepository.findByCrawlParamAndHomeIsCountry( 18,"false" );
       System.out.println(" ");

    }
}
