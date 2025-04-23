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

        Programmable obj = new Programmable();
        obj.wordLastDigit(num);
        sc.close();
        
    }
}

class Programmable{
    public void wordLastDigit(int num){
        int digit = num%10;

        if(digit == 0){
            System.out.println("Last Digit is Zero ");
        }else if(digit == 1){
            System.out.println("Last Digit is One");
        }else if(digit == 2){
            System.out.println("Last Digit is Two");
        }else if(digit == 3){
            System.out.println("Last Digit is Three");
        }else if(digit == 4){
            System.out.println("Last Digit is Four");
        }else if(digit == 5){
            System.out.println("Last Digit is Five");
        }else if(digit == 6){
            System.out.println("Last Digit is Six");
        }else if(digit == 7){
            System.out.println("Last Digit is Seven");
        }else if(digit == 8){
            System.out.println("Last Digit is Eight");
        }else if(digit == 9){
            System.out.println("Last Digit is Nine");
        }
    }

}