package Pattern.Triangle;

import java.util.Scanner;

public class Pattern48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a row: ");
        int row = sc.nextInt();

        for(int i =row;i>=1;i--){
            int ch = 65+row-1;
            for(int j =1;j<=i;j++){
                System.out.print((char)ch+" ");
                ch--;
            }
            System.out.println();

        }

    }
}
