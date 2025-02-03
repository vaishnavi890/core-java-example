package com.vaishnavi.practice.oops.abstraction.service;

import com.vaishnavi.practice.oops.abstraction.model.Game;

public class FootBallService extends Game {
    @Override
    public void start() {
        System.out.println("Football Game Started. Welcome to the match!");
    }

    @Override
    public void play() {
        System.out.println("Football is being played on the field.");
    }

    @Override
    public void end() {
        System.out.println("Football Game Ended. Thanks for playing!");
    }
}

