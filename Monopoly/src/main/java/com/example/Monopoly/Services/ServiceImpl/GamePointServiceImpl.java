package com.example.Monopoly.Services.ServiceImpl;

import com.example.Monopoly.Model.GamePoint;
import com.example.Monopoly.Repositories.GamePointRepository;
import com.example.Monopoly.Services.GamePointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service

public class GamePointServiceImpl implements GamePointService {

    @Autowired
    private GamePointRepository gamePointRepository;

    @Override
    public GamePoint getGamePointById(int id) {
        return gamePointRepository.findById(id);
    }
}
