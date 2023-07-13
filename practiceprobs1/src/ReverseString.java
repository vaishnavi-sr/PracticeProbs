
public class ReverseString {

    public static void main(String[] args) {
        String str = "ABCD";

        String rev = "";

        int len = str.length() ;

      for(int i = len-1;i >= 0;i--){
          rev += str.charAt(i);
      }
        System.out.println("Reverse string is :" + rev);

      //2. Using character array
        String word = "Song";
        char a[] = word.toCharArray();
        int wordLength = word.length();
        String rev2 = "";

        for(int i = wordLength-1;i>=0;i--){
            rev2 = rev2+a[i];
        }
        System.out.println("The reverse of given word is :"+ rev2);



    }
}
