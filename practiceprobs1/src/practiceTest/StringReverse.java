package practiceTest;

import java.util.Scanner;

public class StringReverse {


    public static void main(String[] args) {
        System.out.println("Enter a word - ");
        Scanner input = new Scanner(System.in);
        String word = input.next();

        String revWord = " ";

        while (word != null) {
            for (int i = word.length() - 1; i >= 0; i--) {
                revWord += word.charAt(i);
            }
            System.out.println(revWord);
            break;
        }
    }
}
