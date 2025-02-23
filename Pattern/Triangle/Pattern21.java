package Pattern.Triangle;

import java.util.Scanner;

public class Pattern21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = sc.nextInt();

        int sp = row-1;

        for(int i = row;i>=1;i--){

            //for space
            for(int j =1;j<=sp;j++){
                System.out.print(" ");
            }
            sp--;

            //Numbers
            for(int k = i;k<=row;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }

    }

}
