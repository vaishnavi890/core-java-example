package com.vaishnavi.practice.breakContinue.continueExample;

public class ContinueDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
                //break;
            }
            System.out.println(i);
        }
    }
}

