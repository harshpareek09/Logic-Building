package Strings;
import java.util.Scanner;

public class DuplicateWordsAndNumberOccur {
    public static void main(String[] args) {
        String str = "Hello Harsh Hello Java Harsh Java Java";

        String result[] = str.split(" ");
        
        for(int i =0;i<result.length;i++){
           int count = 1;
           
            for(int j =i+1;j<result.length;j++){
                if(result[i].equals(result[j])){
                    count++;
                    result[j] = "False";
                    
                }
            }
            if(count>1 && result[i]!= "False")
                System.out.println(result[i]+": "+count);
        }

        


    }
}
