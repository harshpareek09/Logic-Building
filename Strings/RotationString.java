package Strings;
import java.util.Scanner;

public class RotationString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "JavaJ2eeStrutsHibernate";
        String str2 = "StrutsHibernateJavaJ2ee";

       String result = str1+str1;
       if(result.contains(str1)){
           System.out.println("Rotation of string");
       }



    }
}
