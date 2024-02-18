public class Palindrome {
    public static void main(String[] args) {
        String name = "Nayan";

       boolean result= checkPalindrome(name.toUpperCase());
        System.out.println(result);
    }






    public static boolean checkPalindrome(String name){     //nayan
         char[] arr=name.toCharArray();
         int start = 0;              //0,1,2
         int end = arr.length-1;    //4,3,2

         while (start<end){         //true,true,false.
             if(arr[start]!=arr[end]){    //false,false,
                 return false;

             }

             start++;
             end--;
         }


        return true;
    }
}
