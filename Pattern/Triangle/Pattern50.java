package Pattern.Triangle;

import java.util.Scanner;

public class Pattern50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a row: ");
        int row = sc.nextInt();

        for(int i =1;i<=row;i++){
            int ch = 65+i-1;
            for(int j =1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){
                System.out.print((char)ch+" ");
                ch--;
            }
            System.out.println();
        }
        sc.close();

    }
}
