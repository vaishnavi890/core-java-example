package addition;

public class AddtionOfTwoNumbers {
    public void add() {

        /*
         Pseudo code : (steps)
         - 2 variables
         - perform addition
         - print the output
        */

        float no1 = 57.6f;
        float no2 = 45f;
        System.out.println("sum of no.1 & no.2 = " + (no1 + no2));
    }

    public static void main(String[] args) {
        AdditionOfTwoNumbers sum = new AdditionOfTwoNumbers();
        sum.add();
    }
}