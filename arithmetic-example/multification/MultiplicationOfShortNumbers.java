package multification;

public class MultiplicationOfShortNumbers {
    public void display() {

        /*
         Pseudo code : (steps)
         - 2 variables
         - perform multiplication
         - print the output
        */

        short no1 = 4321;
        short no2 = 543;
        System.out.println("multiplication of no.1 & no.2 = " + (no1 * no2));
    }

    public static void main(String[] args) {
        MultiplicationOfShortNumbers result = new MultiplicationOfShortNumbers();
        result.display();
    }
}