package Pattern.Triangle;

import java.util.Scanner;

public class Pattern19 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a row:");
    int row = sc.nextInt();

    for(int i =1;i<=row;i++){
        for(int j =1;j<=row-i;j++){
            System.out.print(" ");
        }

        for(int k =1;k<=i;k++){
            System.out.print(i+" ");

        }
        System.out.println();
    }

}
}
