package division;

public class DivisionOfTwoBigNumbers {
    public void divide() {

        /*
         Pseudo code : (steps)
         - 2 variables
         - perform division
         - print the output
        */

        double no1 = 37.966789000;
        double no2 = 26.9999999999;
        System.out.println("division of no.1 & no.2 = " + (no1 / no2));
    }

    public static void main(String[] args) {
        DivisionOfTwoBigNumbers result = new DivisionOfTwoBigNumbers();
        result.divide();
    }
}