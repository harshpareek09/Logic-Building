package Pattern.Triangle;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int row = sc.nextInt();

        for(int i =1;i<=row;i++){

            //Spaces
            for(int j =1;j<=row-i;j++){
                System.out.print(" ");
            }

            //Numbers
            for(int k =i;k<2*i;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
