package com.example.Monopoly.Services.ServiceImpl;

import com.example.Monopoly.Services.DiceRollService;
import org.springframework.stereotype.Service;

@Service
public class DiceRollServiceImpl implements DiceRollService {
    @Override
    public int rollDie() {
        return (int) (Math.random() * 11) + 2;
    }
}
