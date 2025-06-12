package Pattern.Triangle;

import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = sc.nextInt();
        

        for(int i =1;i<=row;i++){
            //Space
            for(int k =1;k<i;k++){
                System.out.print(" ");
            }

            //Nnumber
            for(int j =i;j<=row;j++){
                System.out.print(j+" ");
            }

            System.out.println();

        }
        sc.close();
    }
}
