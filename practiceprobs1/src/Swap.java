public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("The values of a & b are "+ a + " & "+ b + " respectively.");
//         //let's introduce the third value t
//        int t = a;
//        a = b;
//        b = t;
//
//        System.out.println("The values of a & b after swapping the value are "+ a + " & "+ b + " respectively.");

        //logic-2 using + & _
//        a = a+b; //10+20 = 30
//        b = a-b; //30-20 = 10
//        a = a-b; //30- 10 = 20

        //logic-3 using * & / operator
//        a = a*b; //10 * 20 = 200
//        b = a/b; //200/10 = 20
//        a = a/b; //200/20 = 10

        //Single statement to swap
        b= a+b-(a=b);

        System.out.println("The values of a & b after swapping the value are "+ a + " & "+ b + " respectively.");


    }
}
