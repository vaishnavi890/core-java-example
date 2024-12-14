package addition;

public class AdditionOfTwoNumbers {
    public void add() {

        /*
         Pseudo code : (steps)
         - 2 variables
         - perform addition
         - print the output
        */

        double no1 = 56.966789000;
        double no2 = 87.9999999999;
        System.out.println("sum of no.1 & no.2 = " + (no1 + no2));
    }

    public static void main(String[] args) {
        AdditionOfTwoNumbers sum = new AdditionOfTwoNumbers();
        sum.add();
    }
}