package multification;

public class MultiplicationOfNumbers {
    public void display() {

        /*
         Pseudo code : (steps)
         - 2 variables
         - perform multiplication
         - print the output
        */

        float no1 = 32.4f;
        float no2 = 65f;
        System.out.println("multiplication of no.1 & no.2 = " + (no1 * no2));
    }

    public static void main(String[] args) {
        MultiplicationOfNumbers result = new MultiplicationOfNumbers();
        result.display();
    }
}