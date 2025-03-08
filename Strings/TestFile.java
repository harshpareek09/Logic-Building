package Strings;

import java.util.Scanner;

public class TestFile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();



        int count = 1;

        System.out.println("String is: "+str);

        for(int i =0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }

        System.out.println("Count of words in String is: "+count);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        sc.close();
    }
}
