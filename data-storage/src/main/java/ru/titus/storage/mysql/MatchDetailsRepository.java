package ru.titus.storage.mysql;

import org.springframework.data.repository.CrudRepository;
import ru.titus.model.sportradar.MatchDetails;

public interface MatchDetailsRepository extends CrudRepository<MatchDetails,Long> {
}
