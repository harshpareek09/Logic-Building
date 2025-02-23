package Strings;

import java.util.Scanner;

public class EachCharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = new String(sc.nextLine());

        //Create a array for count occurence
        int freq[] = new int[256];

        //Occurence store
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            freq[ch]++;

        }

        for(int i =0;i<freq.length;i++){
            if(freq[i]>0){
                System.out.println(((char)i)+"---> "+freq[i]);
            }
        }

    }

}
