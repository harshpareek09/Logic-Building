package OOPS;

import java.util.Scanner;

public class LastDigitWord {
    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        try{
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }


        sc.close();
        
    }
}
