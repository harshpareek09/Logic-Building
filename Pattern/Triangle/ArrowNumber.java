package Pattern.Triangle;

import java.util.Scanner;

public class ArrowNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a row: ");
        int row = sc.nextInt();
        int star = row-1;

        for(int i =1;i<=row;i++){
            for(int j =1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        for(int i = row+1;i<=(row*2)-1;i++){
            for(int j = 1;j<=star;j++){
                System.out.print(j+" ");
            }
            System.out.println();
            star--;
        }
    }
}
