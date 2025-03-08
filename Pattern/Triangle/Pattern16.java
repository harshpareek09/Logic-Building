package Pattern.Triangle;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a row: ");
        int row = sc.nextInt();

        //Upper Part of Array
        for(int i =1;i<=row;i++){
            //Space
            for(int j =i;j>=1;j--){
                System.out.print(" "+" ");
            }
            //For numbers
            for(int j =i;j<=row;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        int space = row -1;

        //Lower Part of Array
        for(int i =1;i<row;i++){
            //Space
            for(int j =1;j<=space;j++){
                System.out.print(" "+" ");
            }
            //For number
            for(int j =row-i;j<=row;j++){
                System.out.print(j+" ");
            }
            
            System.out.println();
            space--;
        }
        sc.close();
    }
}
