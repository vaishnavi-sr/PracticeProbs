import javax.print.DocFlavor;
import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to be reversed: ");
        int num = sc.nextInt();

        StringBuilder sbl = new StringBuilder(num);
        sbl.append(num);
        StringBuilder rev = sbl.reverse();


        System.out.println("The reversed number is "+ rev);



    }
}
