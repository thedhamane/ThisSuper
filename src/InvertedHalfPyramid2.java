public class InvertedHalfPyramid2 {
    public static void main(String[] args) {
     int n=4;
     //Outer Loop
     for(int i=1;i<=n;i++){
         //Inner Loop -print space
         for(int j=1;j<=n-i;j++){
             System.out.print(" ");
         }
         //Inner Loop - Print *
         for(int j=1;j<=i;j++){
             System.out.print("*");
         }
         System.out.println();
     }
    }
}
