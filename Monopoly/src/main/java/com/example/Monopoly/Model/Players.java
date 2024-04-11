package com.example.Monopoly.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;


@Entity
@Data
@AllArgsConstructor
public class Players {
    @Id
    int player_id;
    int position;
    int money;

//    public Players(int player_id, int position, int money)
//    {
//        this.player_id = player_id;
//        this.position = position;
//        this.money = money;
//    }

    //After purchasing set to true
    /*createGame method -> PlayerRepo
    add two rows - 1,2
    give money to players, set position to 0
    currentPlayer = 1
    for loop -> 1 to <=50,
        if cp == 1
            dice roll
            cp, diceroll ->call movePosition of player
        if cp == 2
            dice roll
            cp, diceroll ->call movePosition of player
        checkDeclareWinner (Post) -> gets players details and checks if money <0 and updates win column, if yes returns winner
            yes -> return;
        if cp == 1, then set cp to 2
        if cp == 2 then set cp to 1

    checkDeclareWinner
    return
     */

}
