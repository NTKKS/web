package cz.uhk.fim.spring.web.rss;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RssController {

    @RequestMapping("/")
    public String index(){
        return "sources";
    }
}
