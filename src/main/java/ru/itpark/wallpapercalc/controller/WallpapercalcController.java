package ru.itpark.wallpapercalc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itpark.wallpapercalc.service.WallpapercalcService;

@Controller
public class WallpapercalcController {
    private WallpapercalcService service;

    public WallpapercalcController(WallpapercalcService service) {
        this.service = service;
    }

    @RequestMapping
    public String index(Model model){
        model.addAttribute("title", "Some value");
        return "index";
    }

    @RequestMapping(params = {"roomHeight", "roomLength", "roomWidth"})
    public String calculate(Model model,
                            @RequestParam double roomHeight,
                            @RequestParam double roomLength,
                            @RequestParam double roomWidth) {
        int result = (int) service.calculate(roomHeight, roomLength, roomWidth);
        model.addAttribute("result", result);
        return "index";
    }
}