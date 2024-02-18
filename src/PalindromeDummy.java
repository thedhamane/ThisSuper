import java.util.ArrayList;
import java.util.List;

public class PalindromeDummy {
    public static void main(String[] args) {
        String name = "my name is aniruddha sanjay dhamane i am a java developer";
        String statement = "";
        char[] arr = name.toCharArray();
        List<Character> list= new ArrayList<>();
        for(char a: arr){
            list.add(a);
        }
        statement=(list.get(0)+"").toUpperCase();
        for(int i=1;i<=list.size()-1;i++){
            char z = list.get(i);
            if(z==' '){
               String name1= list.get(i+1)+"";
               String result=name1.toUpperCase();
               if(result.equals("A")){
                   result= "B";
               }
               statement=statement+' '+result;
                i++;
            }
           else if (z=='a') {
                z='b';
                statement=statement+z;
            }
            else{
                statement=statement+z;
            }
        }

        System.out.println(statement);
         String[] c = name.split("sanjay");
    }

}
