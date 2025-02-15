package Strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = new String(sc.nextLine());

        //Create two pointers
        int start = 0; int end = str.length()-1;

        //Covert string into char Array
        char arr[] = str.toCharArray();

        while(start<=end){
            char ch = arr[start];
            arr[start] = arr[end];
            arr[end] = ch;

            start++;
            end--;
        }

        System.out.println("Reversed of a "+str+" is: "+new String(arr));
        sc.close();
    }
}
