public class ArithmeticOperators {

    public static void main(String[] args) {

        int num1 = 4;
        int num2 = 6;

        int addResult      = num1 + num2;
        int subResult      = num2 - num1;
        int multiplyResult = num1 * num2;
        int div2Result      = num1/2;

        System.out.println(addResult);
//changing the value of variable since it is not declared final
        num1 +=2; //num1= num1 + 2;
        System.out.println(num1);//displays the new value
        //similarly new values can be given by using arithmetic operators

        num1 *= 3;
        System.out.println(num1);

        num1 /=2; //divides the new value by 2
        System.out.println(num1);


    }
}
