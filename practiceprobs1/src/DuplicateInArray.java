public class DuplicateInArray {
    public static void main(String[] args) {

        String arr[] = {"Java","C","C++","Python"};
        boolean flag = false;
        for(int i = 0;i<arr.length;i++)
        {
            for(int j = i+1;j<arr.length;j++)
            {
                if(arr[i] == arr[j])
                {
                    System.out.println("The Duplicate element is "+ arr[i]);
                }
            }
        }
                 if(flag == false)
                 {
                     System.out.println("There is no duplicate element in the given array");
                 }
    }
}
