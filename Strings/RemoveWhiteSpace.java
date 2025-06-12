package Strings;

import java.util.Scanner;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        String rem_space = "";

        char char_str[] = str.toCharArray();

        for(int i =0;i<char_str.length;i++){
            if(char_str[i] != ' ' && char_str[i] != '\t'){
                rem_space = rem_space+char_str[i];
            }
        }
        System.out.println("Input string: "+str);
        System.out.println("Removed space string: "+rem_space);
        sc.close();
    }
}
