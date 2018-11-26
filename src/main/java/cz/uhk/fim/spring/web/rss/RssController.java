package cz.uhk.fim.spring.web.rss;

import cz.uhk.fim.spring.web.utils.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
public class RssController {

    @RequestMapping("/")
    public String index(Model model){
        try {
            model.addAttribute("sources", FileUtils.loadSources());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "sources";
    }
}
