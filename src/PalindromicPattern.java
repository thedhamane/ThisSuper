public class PalindromicPattern {
    public static void main(String[] args) {
        int n =5;
         for(int i=0;i<=n;i++){
             //spaces
             for(int j=1;j<=n-i;j++){
                 System.out.print(" ");
             }
             //1st half num
             for(int j=i;j>=1;j--){
                 System.out.print(j);
             }
             //2nd half num
             for(int j=0;j<=i;j++){
                 System.out.print(j);
             }
             System.out.println();
         }
    }
}
