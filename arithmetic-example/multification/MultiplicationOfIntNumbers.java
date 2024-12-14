package multification;

public class MultiplicationOfIntNumbers {

    public void display() {

        /*
         Pseudo code : (steps)
         - 2 variables
         - perform multiplication
         - print the output
        */

        int no1 = 5421;
        int no2 = 755;
        System.out.println("multiplication of no.1 & no.2 = " + (no1 * no2));
    }

    public static void main(String[] args) {
        MultiplicationOfIntNumbers result = new MultiplicationOfIntNumbers();
        result.display();
    }
}