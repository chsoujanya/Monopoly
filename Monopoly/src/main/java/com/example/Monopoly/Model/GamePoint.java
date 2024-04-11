package com.example.Monopoly.Model;


import lombok.Data;

@Data
public class GamePoint {
    int id;
    int place;
    int buy_price;
    int rent_price;

    String isPurchased;
}
