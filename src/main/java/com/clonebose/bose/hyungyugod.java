package com.clonebose.bose;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class hyungyugod {
    @GetMapping("/hyungyugod")
    public String getHyungyuName(Model model) {
        model.addAttribute("name", "안녕하세요 성현규입니다.");
        return "hyungyugod";
    }

    @GetMapping("/obin")
    public String getObinName(Model model) {
        model.addAttribute("name", "안녕하세요 권오빈입니다.");
        return "hyungyugod";
    }

    @GetMapping("/taeho")
    public String getTaehoName(Model model) {
        model.addAttribute("name", "안녕하세요 정태호입니다.");
        return "hyungyugod";
    }
    
}
