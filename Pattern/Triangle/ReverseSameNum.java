package Pattern.Triangle;

import java.util.Scanner;

public class ReverseSameNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a row: ");
        int row = sc.nextInt();

        int star = row;

        for(int i =1;i<=row;i++){
            for(int j =1;j<=star;j++){
                System.out.print(star+" ");
            }
            System.out.println();
            star--;
        }
    }
}
