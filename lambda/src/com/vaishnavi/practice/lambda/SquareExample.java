package com.vaishnavi.practice.lambda;

public class SquareExample {
    // class instance variable
    private final static int no = 5;

    public static void main(String[] args) {

        SquareExample lambdaDemo = new SquareExample();
        lambdaDemo.useLambdaExpression();
    }

    private void useLambdaExpression() {
        // method local variable
        int anotherNo = 20;

        // implementation of lambda
        Square square = (no) -> {
            // we can access global variables directly inside lambda implementation
            System.out.println("Square of no: " + no * no);
            // we can access local variables directly inside lambda implementation
            System.out.println("Square of anotherNo: " + anotherNo * anotherNo);

            // local variables we use inside lambda are always final implicitly or effectively final
            //anotherNo = 150;
        };

        // actual usage of lambda
        square.printSquare(no);
    }
}
