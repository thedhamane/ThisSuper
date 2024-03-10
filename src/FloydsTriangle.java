public class FloydsTriangle {
    public static void main(String[] args) {
        int n=5;
        int result=0;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                result=result+1;
                System.out.print(result+" ");
            }
            System.out.println();
        }
    }
}
