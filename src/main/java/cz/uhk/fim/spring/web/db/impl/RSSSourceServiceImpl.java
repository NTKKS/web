package cz.uhk.fim.spring.web.db.impl;

import cz.uhk.fim.spring.web.db.RSSSourceRepository;
import cz.uhk.fim.spring.web.db.RSSSourceService;
import cz.uhk.fim.spring.web.model.RSSSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RSSSourceServiceImpl implements RSSSourceService {

    @Autowired
    private RSSSourceRepository rssSourceRepository;

    @Override
    public RSSSource createRSSSource(RSSSource rssSource) {
        return rssSourceRepository.save(rssSource);
    }

    @Override
    public RSSSource loadRSSSourceById(int id) {
        return rssSourceRepository.findById(id).get();
    }

    @Override
    public RSSSource updateRSSSource(RSSSource rssSource) {
        return rssSourceRepository.save(rssSource);
    }

    @Override
    public void removeRSSSource(int id) {
        rssSourceRepository.deleteById(id);
    }

    @Override
    public void removeRSSSource(RSSSource rssSource) {
        rssSourceRepository.delete(rssSource);
    }

    @Override
    public List<RSSSource> loadAllRSSSources() {
        return rssSourceRepository.findAll();
    }
}
