package addition;

public class AdditionOfLongNos {
    public void add() {

        /*
         Pseudo code : (steps)
         - 2 variables
         - perform addition
         - print the output
        */

        long no1 = 3217567L;
        long no2 = 567780L;
        System.out.println("sum of no.1 & no.2 = " + (no1 + no2));
    }

    public static void main(String[] args) {
        AdditionOfLongNos sum = new AdditionOfLongNos();
        sum.add();
    }
}