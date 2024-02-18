import java.util.ArrayList;
import java.util.List;

public class Collections {


    public static void main(String[] args) {
        String[] arr = new String[5];
        List<String> studentsList = new ArrayList<String>();
        studentsList.add("Ajay");
        studentsList.add("Sumit");
        studentsList.add(0,"Parag");
        studentsList.add("Aniruddha");
        studentsList.add("Dhiraj");
        System.out.println(studentsList);
        List<String> newList = new ArrayList<>();
//         for(int i=0;i<studentsList.size();i++){
//             String newName =studentsList.get(i);
//             newName= "Mr."+newName;
//             newList.add(newName);
//         }



         for(String name: studentsList){
             if(name== "Sumit"){
                 name= "Mrs."+name;
             }
             else {
                 name = "Mr." + name;

             }
             newList.add(name);
         }
        System.out.println(newList);






    }
}

