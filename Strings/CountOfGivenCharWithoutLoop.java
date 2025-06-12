package Strings;

import java.util.Scanner;

public class CountOfGivenCharWithoutLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter target charcter: ");
        char ch = sc.nextLine().charAt(0);

        String targetChar = str.valueOf(ch);

        String newStr = str.replace(targetChar,"");

        System.out.println("Count of \""+targetChar+"\" is: "+(str.length()-newStr.length()));

        sc.close();
        
    }
}
