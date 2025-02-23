package Pattern.Triangle;

import java.util.Scanner;

public class Pattern25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a row: ");
        int row = sc.nextInt();
        int lnum = row -1;

        //Upper Part
        for(int i =1;i<=row;i++){
            //Space
            for(int j =1;j<i;j++){
                System.out.print(" ");
            }
            //Number
            for(int k =i;k<=row;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }

        //Lower part
        for(int i =1;i<row;i++){
            //Space
            for(int j =1;j<=(row-i-1);j++){
                System.out.print(" ");
            }
            //Number
            for(int k = lnum;k<=row;k++){
                System.out.print(k+" ");
            }
            lnum--;
            System.out.println();

        }
        
    }
}
