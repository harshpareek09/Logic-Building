package Pattern.Triangle;

import java.util.Scanner;

public class Pattern39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a row: ");
        int row = sc.nextInt();

        for(int i =1;i<=row;i++){
            //Space
            for(int j =1;j<=row-i;j++){
                System.out.print(" ");
            }

            //Stars
            for(int j =1;j<=i;j++){
                if(j==1||j==i||i==row){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
