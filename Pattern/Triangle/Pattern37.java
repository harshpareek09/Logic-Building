package Pattern.Triangle;

import java.util.Scanner;

public class Pattern37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a row: ");
        int row = sc.nextInt();

        int star = row;

        for(int i =1;i<=row;i++){
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
            System.out.println();
            star--;
        }
        sc.close();
    }
}
