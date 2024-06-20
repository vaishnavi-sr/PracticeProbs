package TestSolutions;

public class StringReverse {


    public static void main(String[] args) {
        String word = "Hello!";
        String rev = " ";
        if(word == null){
            throw new IllegalArgumentException("Null is not a valid Input!");
        }

        for (int i = word.length()-1;i >= 0;i--){
            rev +=word.charAt(i);
        }
        System.out.println(rev);

    }
}
