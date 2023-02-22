package Spring_MVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/g")
public class SpringMVCController {

    @RequestMapping("/enterInfo")
    public String enterInfo() {
        return "enterInfo";
    }

    @RequestMapping("/showInfo")
    public String showInfo() {
        return "showInfo";
    }
}
