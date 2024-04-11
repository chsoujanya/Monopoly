package com.example.Monopoly.Controllers;

import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiceRolledController {

    @GetMapping("/roll-die")
    public int rollDie() {
        int result = (int) (Math.random() * 11) + 2;
        return result;
    }
}
