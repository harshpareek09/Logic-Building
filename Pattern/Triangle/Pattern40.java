package Pattern.Triangle;

import java.util.Scanner;

public class Pattern40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a row: ");
        int row = sc.nextInt();
        int star = row;

        //upper Part
        for(int i =1;i<=row;i++){
            //Space
            for(int j =1;j<i;j++){
                System.out.print(" ");
            }
            for(int j =1;j<=star;j++){
                if(i==1||j==1||j==star){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            star--;
            System.out.println();
        }

        star = 2;
        //Lower Part
        for(int i =1;i<row;i++){
            //Space
            for(int j =1;j<=(row-i-1);j++){
                System.out.print(" ");
            }

            //Star
            for(int j =1;j<=star;j++){
                if((i==row-1)||j==1||j==star){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            star++;
            System.out.println();
        }

        sc.close();
    }
}
