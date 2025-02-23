package Pattern.Triangle;

import java.util.Scanner;

public class Pattern24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = sc.nextInt();
        

        for(int i =1;i<=row;i++){
            //Space
            for(int j =1;j<i;j++){
                System.out.print(" ");
            }
            //Numbers
            for(int k =row;k>=i;k--){
                System.out.print(k+" ");
            }
            System.out.println();
        }


    }
}
