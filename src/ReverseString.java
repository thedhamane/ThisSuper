public class ReverseString {
    public static int getWordCount(String s){
        int wordcount = 0;
        if(s.length()>0){
            char[] nameArr = s.toCharArray();
            int lastIndex = nameArr.length-1;     //5
            for(int i=0;i<= lastIndex;i++){       //i=0,1,2,3,4,5
                if(i!= lastIndex ){              // true,true,true,true,true,false
                    if(nameArr[i]==' '&& nameArr[i+1]!=' '){   //false,false,false,false,false,true
                        wordcount= wordcount+1;           //0,0,0,0,1
                    }
                }

            }
            int lastindex =nameArr.length-1;
            if(lastindex!=' ') {
                wordcount++;
            }
        }

        return wordcount;

    }



    public static char getMostFrqChar(String input){
        char[] arr = input.toCharArray();



        return ' ';
    }



    public static void main(String[] args) {
        String s = "Most Frequent Character";

        int result=getWordCount(s);




    }
}
