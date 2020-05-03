package org.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/Home")
public class HomeController {
    @RequestMapping(path = "/Index")
    public String Index()
    {

        return "Index";
    }
}
