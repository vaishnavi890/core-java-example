package subtraction;

public class SubtractionOfLongNumbers {
    public void display() {

        /*
         Pseudo code : (steps)
         - 2 variables
         - perform subtraction
         - print the output
        */

        long no1 = 76543212L;
        long no2 = 654325L;
        System.out.println("subtraction of no.1 & no.2 = " + (no1 - no2));
    }

    public static void main(String[] args) {
        SubtractionOfLongNumbers result = new SubtractionOfLongNumbers();
        result.display();
    }
}