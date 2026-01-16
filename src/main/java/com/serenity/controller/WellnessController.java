package com.serenity.controller;

import com.serenity.model.WellnessData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WellnessController {

    private WellnessData data = new WellnessData();

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("data", data);
        return "index";
    }

    @PostMapping("/save")
    public String saveData(
            @RequestParam String mood,
            @RequestParam String food,
            @RequestParam int water,
            @RequestParam double sleep
    ) {
        data.setMood(mood);
        data.setFood(food);
        data.setWater(water);
        data.setSleep(sleep);

        return "redirect:/";
    }
}

