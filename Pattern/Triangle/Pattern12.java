package Pattern.Triangle;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int row = sc.nextInt();
        int space = row-1;

        for(int i =1;i<=row;i++){

            //1st Part
            for(int j = 1;j<=space;j++){
                System.out.print(" "+" ");
            }

            //2nd Part
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
            space--;
        }
        sc.close();
    }
}
