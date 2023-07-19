import java.sql.SQLOutput;
import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int rev = 0;
        int orig_num = num;

        while(num != 0)
        {
             rev= rev*10 + num%10;
             num = num/10;
        }
        System.out.println(rev +" is the reversed number.");

        if(orig_num == rev){
            System.out.println(orig_num+ " The number is Palindrome.");
        }else{
            System.out.println(orig_num+ " The number is not Palindrome.");
        }


    }
}
