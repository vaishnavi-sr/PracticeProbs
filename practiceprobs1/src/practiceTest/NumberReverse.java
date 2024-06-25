package practiceTest;

import java.util.Scanner;

public class NumberReverse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = input.nextInt();


        while(num != 0){
               StringBuilder sb = new StringBuilder();
               sb.append(num);

               StringBuilder revNum = sb.reverse();
                System.out.println("The reversed number is "+  revNum);
               break;
        }



    }
}
