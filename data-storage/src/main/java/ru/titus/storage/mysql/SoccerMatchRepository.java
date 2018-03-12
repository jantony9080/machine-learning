package ru.titus.storage.mysql;

import org.springframework.data.repository.CrudRepository;
import ru.titus.model.sportradar.SoccerMatch;

public interface SoccerMatchRepository extends CrudRepository<SoccerMatch, Long> {

}
