package com.vaishnavi.loop.pattern.whileLoop;

public class InfiniteWhileLoop {
    public static void main(String[] args) {
        int i = 1;

        // Infinite loop
        while (true) {
            System.out.println("This is iteration: " + i);
            i++;

            if (i > 5) {
                break; // break the loop after 5 iterations
            }
        }
    }
}
