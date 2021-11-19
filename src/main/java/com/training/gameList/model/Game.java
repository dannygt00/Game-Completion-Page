package com.training.gameList.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String console;
    private String genre;
    private int releaseYear;
    private boolean isCompleted;

    public Game() {

    }

    public Game(Long id, String name, String console, String genre, int releaseYear, boolean isCompleted) {
        this.id = id;
        this.name = name;
        this.console = console;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.isCompleted = isCompleted;
    }

    public Game(String name, String console, String genre, int releaseYear, boolean isCompleted) {
        this.name = name;
        this.console = console;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.isCompleted = isCompleted;
    }

    public Game(String name, String console, int releaseYear, boolean isCompleted) {
        this.name = name;
        this.console = console;
        this.releaseYear = releaseYear;
        this.isCompleted = isCompleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    @Override
    public String toString() {
        return "Game [console=" + console + ", genre=" + genre + ", id=" + id + ", isCompleted=" + isCompleted
                + ", name=" + name + ", releaseYear=" + releaseYear + "]";
    }

}
