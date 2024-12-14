package subtraction;

public class SubtractionOfNumbers {
    public void display() {

        /*
         Pseudo code : (steps)
         - 2 variables
         - perform subtraction
         - print the output
        */

        float no1 = 32.1f;
        float no2 = 76f;
        System.out.println("subtraction of no.1 & no.2 = " + (no1 - no2));
    }

    public static void main(String[] args) {
        SubtractionOfNumbers result = new SubtractionOfNumbers();
        result.display();
    }
}