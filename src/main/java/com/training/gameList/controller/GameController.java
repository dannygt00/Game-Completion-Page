package com.training.gameList.controller;

import java.util.List;

import com.training.gameList.model.Game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(path = "api/gameList")
public class GameController {

    private final GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping(path = "/games")
    public ModelAndView getGames() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("viewGames", gameService.getGames());
        return modelAndView;
    }

    @PostMapping
    public void addGame(@RequestBody Game game) {
        gameService.addNewGame(game);
    }

    @DeleteMapping(path = "{gameId}")
    public void deleteGame(@PathVariable("gameId") Long gameId) {
        gameService.deleteGame(gameId);
    }

    @PutMapping(path = "{gameId}")
    public void updateGame(@PathVariable("gameId") Long gameId, @RequestParam boolean isCompleted) {
        gameService.updateGame(gameId, isCompleted);
    }
}
