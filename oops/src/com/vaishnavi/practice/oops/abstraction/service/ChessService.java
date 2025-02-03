package com.vaishnavi.practice.oops.abstraction.service;

import com.vaishnavi.practice.oops.abstraction.model.Game;

public class ChessService extends Game {
    @Override
    public void start() {
        System.out.println("Chess Game Started. Set up the board.");
    }

    @Override
    public void play() {
        System.out.println("Players are making moves on the chessboard.");
    }

    @Override
    public void end() {
        System.out.println("Chess Game Ended. Checkmate!");
    }
}

