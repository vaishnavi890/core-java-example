package division;

public class DivisionOfTwoNumbers {
    public void divide() {

        /*
         Pseudo code : (steps)
         - 2 variables
         - perform division
         - print the output
        */

        float no1 = 13.5f;
        float no2 = 37f;
        System.out.println("division of no.1 & no.2 = " + (no1 / no2));
    }

    public static void main(String[] args) {
        DivisionOfTwoNumbers result = new DivisionOfTwoNumbers();
        result.divide();
    }
}