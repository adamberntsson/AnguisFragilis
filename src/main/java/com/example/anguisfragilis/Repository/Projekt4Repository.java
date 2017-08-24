package com.example.anguisfragilis.Repository;

import com.example.anguisfragilis.Domain.HighScore;
import com.example.anguisfragilis.Domain.User;

import java.util.List;

public interface Projekt4Repository {
    boolean addUser(User user);
    User checkForLogin(User user);
    void addScore (int score, User user);
    List<HighScore> getHighScores();
}
