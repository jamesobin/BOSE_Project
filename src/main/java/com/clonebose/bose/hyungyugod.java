package com.clonebose.bose;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;


@Controller
public class hyungyugod {
    @GetMapping("/hyungyugod")
    public String getHyungyuName(Model model) {
        model.addAttribute("name", "안녕하세요 성현규입니다.");
        return "hyungyugod";
    }
    
}
