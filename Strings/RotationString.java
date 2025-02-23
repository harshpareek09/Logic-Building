package Strings;
import java.util.Scanner;

public class RotationString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String 1: ");
        String string_1= sc.next();
        System.out.print("Enter a String 2: ");
        String string_2 = sc.next();

        if(string_1.length() != string_2.length()){
            System.out.println("String 1 is not a rotation of string 2");
        }
        else{
            int flag =1;
            for(int i =0;i<string_1.length();i++){
                if(string_1.charAt(i) != string_2.charAt(i)){
                    flag = 0;
                    break;
                }

            }
            if(flag == 1){
                System.out.println("String one");
            }
        }
    }
}
