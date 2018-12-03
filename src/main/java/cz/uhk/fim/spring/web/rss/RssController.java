package cz.uhk.fim.spring.web.rss;

import cz.uhk.fim.spring.web.db.RSSSourceService;
import cz.uhk.fim.spring.web.model.RSSSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RssController {

    private final RSSSourceService rssSourceService;

    @Autowired
    public RssController(RSSSourceService rssSourceService){
        this.rssSourceService = rssSourceService;
    }

    @GetMapping(value = "/")
    public String index(Model model){
        model.addAttribute("sources", rssSourceService.loadAllRSSSources());
        return "sources";
    }

    @PostMapping(value = "/source")
    public String addNewSource(@ModelAttribute RSSSource rssSource, Model model){
        rssSourceService.createRSSSource(rssSource);
        model.addAttribute("sources", rssSourceService.loadAllRSSSources());
        return "sources";
    }

    @GetMapping(value="/sources")
    public  String getSources(Model model){
        model.addAttribute("source",new RSSSource());
        return "addsource";
    }
}
