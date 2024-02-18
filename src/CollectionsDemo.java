public class CollectionsDemo {
   static int arr[] =new int[10];

    public static void setArr(){
        arr[0]=1;
        arr[1]=2;
        for(int i=2;i<arr.length;i++){
            arr[i]=i+1;
        }

    }
    public static void getArr(){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        getArr();
       setArr();
       getArr();
    }

}
