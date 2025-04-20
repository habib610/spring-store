package org.rhabib.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")     
    public String index() {
        System.out.println("How are you? man");
        return "index.html";
    }
}
