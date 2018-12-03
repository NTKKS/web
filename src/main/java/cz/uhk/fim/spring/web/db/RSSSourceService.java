package cz.uhk.fim.spring.web.db;

import cz.uhk.fim.spring.web.model.RSSSource;

import java.util.List;

public interface RSSSourceService {
    RSSSource createRSSSource(RSSSource rssSource);
    RSSSource loadRSSSourceById(int id);
    RSSSource updateRSSSource(RSSSource rssSource);
    void removeRSSSource(int id);
    void removeRSSSource(RSSSource rssSource);
    List<RSSSource> loadAllRSSSources();
}
