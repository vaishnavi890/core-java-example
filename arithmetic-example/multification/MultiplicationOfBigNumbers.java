package multification;

public class MultiplicationOfBigNumbers {
    public void Display() {

        /*
         Pseudo code : (steps)
         - 2 variables
         - perform multiplication
         - print the output
        */

        double no1 = 32.966789000;
        double no2 = 75.9999999999;
        System.out.println("multiplication of no.1 & no.2 = " + (no1 * no2));
    }

    public static void main(String[] args) {
        MultiplicationOfBigNumbers result = new MultiplicationOfBigNumbers();
        result.Display();
    }
}