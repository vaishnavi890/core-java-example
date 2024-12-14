package division;

public class DivisionOfShortNumbers {
    public void divide() {

        /*
         Pseudo code : (steps)
         - 2 variables
         - perform division
         - print the output
        */

        short no1 = 2341;
        short no2 = 753;
        System.out.println("division of no.1 & no.2 = " + (no1 / no2));
    }

    public static void main(String[] args) {
        DivisionOfShortNumbers result = new DivisionOfShortNumbers();
        result.divide();
    }
}