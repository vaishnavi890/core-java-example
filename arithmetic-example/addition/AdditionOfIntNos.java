package addition;

public class AdditionOfIntNos {

    public void add() {

        /*
         Pseudo code : (steps)
         - 2 variables
         - perform addition
         - print the output
        */

        int no1 = 256;
        int no2 = 450;
        System.out.println("sum of no.1 & no.2 = " + (no1 + no2));
    }

    public static void main(String[] args) {
        AdditionOfIntNos sum = new AdditionOfIntNos();
        sum.add();
    }
}