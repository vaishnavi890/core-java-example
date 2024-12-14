package addition;

public class AdditionOfShortNos {
    public void add() {

        /*
         Pseudo code : (steps)
         - 2 variables
         - perform addition
         - print the output
        */

        short no1 = 2431;
        short no2 = 462;
        System.out.println("sum of no.1 & no.2 = " + (no1 + no2));
    }

    public static void main(String[] args) {
        AdditionOfShortNos sum = new AdditionOfShortNos();
        sum.add();
    }
}