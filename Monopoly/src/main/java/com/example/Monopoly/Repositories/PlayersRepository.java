package com.example.Monopoly.Repositories;

import com.example.Monopoly.Model.Players;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PlayersRepository extends JpaRepository<Players, Integer> {

    public Players create(Players players);

    public Players findById(int id);

    Players save(Players player);
}
