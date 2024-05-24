package operators;

public class LogicalOperators {

    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        int a = 8;
        int b = 9;

        //relational operators are AND-&&, OR-||, NOT-!
        boolean result = x < y && a < b;//true as both are true

        System.out.println(!result);// false as !-NOT shows the opposite
        boolean result1 = x == y || a < b;
        System.out.println(result1); //true as one is true

    }
}
