package subtraction;

public class SubtractionOfShortNumbers {
    public void display() {

        /*
         Pseudo code : (steps)
         - 2 variables
         - perform subtraction
         - print the output
        */

        short no1 = 8653;
        short no2 = 467;
        System.out.println("subtraction of no.1 & no.2 = " + (no1 - no2));
    }

    public static void main(String[] args) {
        SubtractionOfShortNumbers result = new SubtractionOfShortNumbers();
        result.display();
    }
}