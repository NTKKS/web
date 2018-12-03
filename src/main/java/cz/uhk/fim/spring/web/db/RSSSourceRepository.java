package cz.uhk.fim.spring.web.db;

import cz.uhk.fim.spring.web.model.RSSSource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RSSSourceRepository extends JpaRepository<RSSSource, Integer> {
}
