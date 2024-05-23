public class ArithmeticOperators {

    public static void main(String[] args) {

        int num = 4;
        int num2 = 6;

        int addResult      = num + num2;
        int subResult      = num2 - num;
        int multiplyResult = num * num2;
        int div2Result      = num/2;

        System.out.println(addResult);
//changing the value of variable since it is not declared final
        num +=2; //num= num + 2;
        System.out.println(num);//displays the new value
        //similarly new values can be given by using arithmetic operators

        num *= 3;
        System.out.println(num);

        num /=2; //divides the new value by 2
        System.out.println(num);

        //increment and decrement
        num++;
        System.out.println(num);

        num--;
        System.out.println(num);

        //there can also be pre-increment and post-increment

        num++; //post-increment
        ++num; //pre-increment
        //both are same but when we assign it to a variable it shows the difference
        System.out.println(num);// num = 11

        int result = num++;//num = 11
        System.out.println(result);// result =11 fetch and increment

        int result1 = ++num;
        System.out.println(result1);// result1 = 13 increment and fetch





    }
}
