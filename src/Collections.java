import java.util.ArrayList;
import java.util.List;

public class Collections {


    public static void main(String[] args) {
//        String[] arr = new String[5];
//        List<String> studentsList = new ArrayList<String>();
//        studentsList.add("Ajay");
//        studentsList.add("Sumit");
//        studentsList.add(0,"Parag");
//        studentsList.add("Aniruddha");
//        studentsList.add("Dhiraj");
//        System.out.println(studentsList);
//        List<String> newList = new ArrayList<>();
////         for(int i=0;i<studentsList.size();i++){
////             String newName =studentsList.get(i);
////             newName= "Mr."+newName;
////             newList.add(newName);
////         }
//
//
//
//         for(String name: studentsList){
//             if(name.equals("Sumit")){
//                 name= "Mrs."+name;
//             }
//             else {
//                 name = "Mr." + name;
//
//             }
//             newList.add(name);
//         }
//        System.out.println(newList);
//

        List<Student> studentList = new ArrayList<>();
            Student s1 = new Student();
            Student s2 = new Student();
            Student s3 = new Student();
            s1.setName("Aniruddha");
            s1.setRollNo(101);
              List<Integer> aniruddhasMarks = new ArrayList<>();
                aniruddhasMarks.add(80);
                aniruddhasMarks.add(70);
                aniruddhasMarks.add(75);
                s1.setMarksList(aniruddhasMarks);

                s2.setName("Parag");
            s2.setRollNo(102);
            List<Integer> paragsMarks = new ArrayList<>();
                paragsMarks.add(85);
                paragsMarks.add(100);
                paragsMarks.add(80);                                    //studentlist la student add kr
                s2.setMarksList(paragsMarks);                           //list loop lavaycha

                s3.setName("Ajay");
                s3.setRollNo(103);
           ArrayList<Integer>ajaysMarks = new ArrayList<>();
                ajaysMarks.add(95);
                ajaysMarks.add(90);
                ajaysMarks.add(70);
                s3.setMarksList(ajaysMarks);

                studentList.add(s1);
                studentList.add(s2);
                studentList.add(s3);

                ArrayList<Student> passList = new ArrayList<>();
                for(Student a: studentList ){
                    int sum = 0;
                    for(int i=0;i<a.getMarksList().size();i++){
                        sum= sum+a.getMarksList().get(i);
                    }
                    if(sum>=250){
                        passList.add(a);
                    }
                }
        System.out.println(passList);
    }
}