package com.training.gameList.controller;

import java.util.List;
import java.util.Optional;

import com.training.gameList.model.Game;
import com.training.gameList.repository.GameRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    private final GameRepository gameRepository;

    @Autowired
    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public List<Game> getGames() {
        return gameRepository.findAll();
    }

    // Find way to verify duplicates aren't present
    public void addNewGame(Game game) {
        // Optional<Game> gameChecker = gameRepository.findByName(game.getName());
        gameRepository.save(game);
    }

    public void deleteGame(Long id) {
        // Optional<Game> gameChecker = gameRepository.findById(id);
        // if (gameChecker.isPresent()) {
        // gameRepository.deleteById(id);
        // } else {
        // throw new IllegalStateException("Item with that ID does not exist");
        // }

        try {
            gameRepository.deleteById(id);
        } catch (Exception e) {
            throw new IllegalStateException("Item with that ID does not exist");
        }
    }

    public void updateGame(Long id, boolean isCompleted) {
        Game updated = gameRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Game with id " + id + " does not exist"));
        updated.setCompleted(isCompleted);

    }
}
