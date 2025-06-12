package Strings;

import java.util.Scanner;

public class DesiredCharacterInStringUsingRecrrsion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = new String(sc.nextLine());
        System.out.print("Enter a character: ");
        char ch = sc.nextLine().charAt(0);
        int count = countOccurence(str,ch, 0);

        System.out.println("Count of '"+ch+"' in a string is: "+count);
        sc.close();

        
    }

    public static int countOccurence(String str,char ch,int idx){
        int count = 0;
        //Base condition
        if(idx >=str.length()){
            return 0;
        }

        if(str.charAt(idx) == ch){
            count = 1;
        }

        return count+countOccurence(str, ch, idx+1);
    }
}
