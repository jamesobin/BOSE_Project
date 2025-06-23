package com.clonebose.bose;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class hyungyugodnonojihoongod {
    @GetMapping("/hyungyugod")
    public String getHyungyuName(Model model) {
        model.addAttribute("name", "안녕하세요 성현규입니다. 아닙니다 양지훈입니다.");
        return "hyungyugod";
    }
    
}
