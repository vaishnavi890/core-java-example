package com.vaishnavi.practice.oops.abstraction;

import com.vaishnavi.practice.oops.abstraction.model.Game;
import com.vaishnavi.practice.oops.abstraction.service.ChessService;
import com.vaishnavi.practice.oops.abstraction.service.FootBallService;

public class GameExample {
    public static void main(String[] args) {
        Game football = new FootBallService();
        football.displayRules();
        football.start();
        football.play();
        football.end();

        System.out.println("-----------------------------");

        Game chess = new ChessService();
        chess.displayRules();
        chess.start();
        chess.play();
        chess.end();
    }
}

