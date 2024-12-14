package division;

public class DivisionOfLongNumbers {
    public void divide() {

        /*
         Pseudo code : (steps)
         - 2 variables
         - perform division
         - print the output
        */

        long no1 = 123554L;
        long no2 = 235342L;
        System.out.println("division of no.1 & no.2 = " + (no1 / no2));
    }

    public static void main(String[] args) {
        DivisionOfLongNumbers result = new DivisionOfLongNumbers();
        result.divide();
    }
