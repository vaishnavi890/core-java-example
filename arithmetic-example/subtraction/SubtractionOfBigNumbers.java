package subtraction;

public class SubtractionOfBigNumbers {
    public void display() {

        /*
         Pseudo code : (steps)
         - 2 variables
         - perform subtraction
         - print the output
        */

        double no1 = 43.983208767;
        double no2 = 21.9975567889;
        System.out.println("subtraction of no.1 & no.2 = " + (no1 - no2));
    }

    public static void main(String[] args) {
        SubtractionOfBigNumbers result = new SubtractionOfBigNumbers();
        result.display();
    }
}