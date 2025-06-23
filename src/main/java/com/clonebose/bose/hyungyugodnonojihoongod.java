package com.clonebose.bose;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
<<<<<<< HEAD:src/main/java/com/clonebose/bose/hyungyugodnonojihoongod.java
=======

>>>>>>> e97a2cecfe7909acd58a9093c427d54b799dc2db:src/main/java/com/clonebose/bose/hyungyugod.java

@Controller
public class hyungyugodnonojihoongod {
    @GetMapping("/hyungyugod")
    public String getHyungyuName(Model model) {
<<<<<<< HEAD:src/main/java/com/clonebose/bose/hyungyugodnonojihoongod.java
        model.addAttribute("name", "안녕하세요 성현규입니다. 아닙니다 양지훈입니다.");
=======
        model.addAttribute("name", "안녕하세요 성현규입니다. 인기 만점이네요");
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
>>>>>>> e97a2cecfe7909acd58a9093c427d54b799dc2db:src/main/java/com/clonebose/bose/hyungyugod.java
        return "hyungyugod";
    }
    
}
