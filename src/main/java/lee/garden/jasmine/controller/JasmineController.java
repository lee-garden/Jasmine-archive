package lee.garden.jasmine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JasmineController {

    @GetMapping("/jasmine/home")
    public String home() {
        return "jasmine/home";
    }
}
