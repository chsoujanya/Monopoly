package com.example.Monopoly.Repositories;

import com.example.Monopoly.Model.GamePoint;
import org.springframework.stereotype.Repository;

@Repository

public interface GamePointRepository {

    GamePoint findById(int id);
}
