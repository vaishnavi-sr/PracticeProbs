
public class ReverseString {

    public static void main(String[] args) {
        String str = "ABCD";

        String rev = "";

        int len = str.length() ;

      for(int i = len-1;i >= 0;i--){
          rev += str.charAt(i);
      }
        System.out.println("Reverse string is :" + rev);

    }
}
