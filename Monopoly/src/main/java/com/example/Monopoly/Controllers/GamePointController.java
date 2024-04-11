package com.example.Monopoly.Controllers;


import com.example.Monopoly.Model.GamePoint;
import com.example.Monopoly.Services.GamePointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/game")

public class GamePointController {

    @Autowired
    private GamePointService gamePointService;

    @GetMapping("/game/point/{id}")
    public GamePoint getGamePointById(@PathVariable int id) {
        return gamePointService.getGamePointById(id);
    }


}
