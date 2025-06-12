package Pattern.Triangle;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a row: ");
        int row = sc.nextInt();
        int star = row;

        for(int i =1;i<=row;i++){

            // 1st Part
            for(int j =i-1;j>=1;j--){
                System.out.print(" "+" ");
            }
            // 2nd Part
            for(int j =1;j<=star;j++){
                System.out.print(j+" ");
            }
            System.out.println();
            star--;
        }
        sc.close();
    }
}
