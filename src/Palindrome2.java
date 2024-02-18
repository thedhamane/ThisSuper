public class Palindrome2 {
    public static void main(String[] args) {
        String name = "nayaN";
      boolean result1 = checkPalindrome(name);
        System.out.println(result1);
    }

    public static boolean checkPalindrome(String name){
        char[] arr = name.toCharArray();
        String result = "";
        for(int i= arr.length-1;i>=0;i--){
       result= result+arr[i];

        }


        if(name.equals(result)){
            return true;
        }
        return false;
    }
}
