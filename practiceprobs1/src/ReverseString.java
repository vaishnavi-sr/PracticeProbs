
public class ReverseString {

    public static void main(String[] args) {
        String str = "ABCD";

        String rev = "";

        for(int i = str.length()-1;i>=0;i--){
            rev += str.charAt(i);
        }
        System.out.println(rev);


      //2. Using character array
        String word = "Song";
        char a[] = word.toCharArray();
        int wordLength = a.length;
        String rev2 = "";

        for(int i = wordLength-1;i>=0;i--){
            rev2 = rev2+a[i];
        }
        System.out.println("The reverse of given word is :"+ rev2);

       //3. Using StringBuffer class
       String word2 = "Music";
       StringBuffer sb = new StringBuffer(word2);


        System.out.println("The reverse of given word2 is :"+ sb.reverse());


    }

}


