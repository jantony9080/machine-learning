package ru.titus.storage.mysql;

import org.springframework.data.repository.CrudRepository;
import ru.titus.model.datafeed.MatchOdd;

public interface MatchOddsRepository extends CrudRepository<MatchOdd,Long> {
}
