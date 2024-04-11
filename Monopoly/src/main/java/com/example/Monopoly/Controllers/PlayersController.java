package com.example.Monopoly.Controllers;

import com.example.Monopoly.Model.Players;
import com.example.Monopoly.Repositories.GamePointRepository;
import com.example.Monopoly.Repositories.PlayersRepository;
import com.example.Monopoly.Services.DiceRollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/players")
public class PlayersController {

    @Autowired
    PlayersRepository playersRepository;

    @Autowired
    GamePointRepository gamePointRepository;
    @Autowired
    DiceRolledController diceRolledController;

    @Autowired
    private DiceRollService diceRollService;

    @Autowired
    Players players;

    @PostMapping("/playersDetails")
    public Players savePlayersDetails(@RequestBody Players players)
    {
        return playersRepository.save(players);
    }

    @GetMapping("/players/{id}")
    public Players getPlayerById(@PathVariable (value = "id") int id)
    {
        return playersRepository.findById(id);
    }

    @PostMapping("/movePlayer/{id}")
    public Players movePlayer(@PathVariable (value = "id") int id, @PathVariable (value = "diceCount") int diceCount){
        int dice_count = diceRolledController.rollDie();
        int a = (playersRepository.findById(id).getPosition() + dice_count) % 10;
        if(a==0)
        {
            a= 10;
        }

        playersRepository.findById(id).setPosition(a);

        if(playersRepository.findById(id).getPosition() > a)
        {
            playersRepository.findById(id).setMoney(200);
        }

        if(!(gamePointRepository.findById(a).getIsPurchased() == null) && gamePointRepository.findById(a).getIsPurchased().equals("t") )
        {
            playersRepository.findById(id).setMoney(playersRepository.findById(id).getMoney() - gamePointRepository.findById(id).getRent_price());

        }
        else
        {
            playersRepository.findById(id).setMoney(playersRepository.findById(id).getMoney() - gamePointRepository.findById(id).getBuy_price());
        }


        if(playersRepository.findById(id).getMoney() < 0)
        {
            return playersRepository.findById(id) ;
        }


        return players;

    }


    @PostMapping("/create")
    public Players createGame()
    {
        playersRepository.deleteAll();
        Players newPlayer1 = new Players(1, 0, 100);
        Players newPlayer2 = new Players(2, 0, 100);

        return players;


    }

    @PostMapping("/playGame")
    public Players playGame()
    {
        for(int i = 1; i<=50; i++)
        {


                int dice = diceRolledController.rollDie();
                movePlayer(i%2 + 1, dice);



            if(playersRepository.getById(i%2 + 1).getMoney() < 0)
            {


                return players;
            }
        }

        return players;
    }

    @PostMapping("/checkWinner")
    public String checkWinner()
    {
        if(playersRepository.getById(1).getMoney() > playersRepository.getById(2).getMoney())
        {
            return "Player1 is the Winner";
        }
        else
        {
            return "Player2 is the Winner";
        }
    }
}
