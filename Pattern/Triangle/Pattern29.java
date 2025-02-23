package Pattern.Triangle;

import java.util.Scanner;

public class Pattern29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a row: ");
        int row = sc.nextInt();


        for(int i =1;i<=row;i++){
            for(int j =1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
