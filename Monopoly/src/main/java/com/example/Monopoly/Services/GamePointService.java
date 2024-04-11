package com.example.Monopoly.Services;

import com.example.Monopoly.Model.GamePoint;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface GamePointService {

    GamePoint getGamePointById(int id);
}
