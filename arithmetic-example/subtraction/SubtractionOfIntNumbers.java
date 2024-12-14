package subtraction;

public class SubtractionOfIntNumbers {

    public void display() {

        /*
         Pseudo code : (steps)
         - 2 variables
         - perform subtraction
         - print the output
        */

        int no1 = 6543;
        int no2 = 456;
        System.out.println("subtraction of no.1 & no.2 = " + (no1 - no2));
    }

    public static void main(String[] args) {
        SubtractionOfIntNumbers result = new SubtractionOfIntNumbers();
        result.display();
    }
}