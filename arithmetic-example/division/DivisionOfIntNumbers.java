package division;

public class DivisionOfIntNumbers {

    public void divide() {

        /*
         Pseudo code : (steps)
         - 2 variables
         - perform division
         - print the output
        */

        int no1 = 2422;
        int no2 = 321;
        System.out.println("division of no.1 & no.2 = " + (no1 / no2));
    }

    public static void main(String[] args) {
        DivisionOfIntNumbers result = new DivisionOfIntNumbers();
        result.divide();
    }
}