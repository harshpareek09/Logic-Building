package Pattern.Triangle;

import java.util.Scanner;

public class Pattern14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a row: ");
        int row = sc.nextInt();

        int space = row-1;

        for(int i =1;i<=row;i++){

            //Space part
            for(int j =1;j<=space;j++){
                System.out.print(" "+" ");
            }
            space--;



            //Number Part
            for(int j = i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();

    }
}