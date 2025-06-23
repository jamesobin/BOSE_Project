package com.clonebose.bose;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KwonController {
    
    @GetMapping("/kwon")
    public String kwon() {
        return "kwon/kwon";
    }

}
