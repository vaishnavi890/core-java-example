package multification;

public class MultiplicationOfLongNumbers {
    public void display() {

        /*
         Pseudo code : (steps)
         - 2 variables
         - perform multiplication
         - print the output
        */

        long no1 = 5432195L;
        long no2 = 432157L;
        System.out.println("multiplication of no.1 & no.2 = " + (no1 * no2));
    }

    public static void main(String[] args) {
        MultiplicationOfLongNumbers result = new MultiplicationOfLongNumbers();
        result.display();
    }
}