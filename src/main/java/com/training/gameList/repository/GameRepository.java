package com.training.gameList.repository;

import java.util.List;

import com.training.gameList.model.Game;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

    Game findByName(String name);

    List<Game> findByReleaseYear(int year);

    List<Game> findByGenre(String genre);

    List<Game> findByConsole(String console);

    List<Game> findByIsCompletedTrue();

}
