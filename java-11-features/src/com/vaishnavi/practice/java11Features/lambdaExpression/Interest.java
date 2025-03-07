package com.vaishnavi.practice.java11Features.lambdaExpression;

    @FunctionalInterface
    public interface Interest {

        double calculate(int principalAmt, float interestRate);
    }

