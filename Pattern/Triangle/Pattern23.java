package Pattern.Triangle;

import java.util.Scanner;

public class Pattern23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = sc.nextInt();
        int num = row;

        for(int i =1;i<=row;i++){
            //Space
            for(int j =1;j<=row-i;j++){
                System.out.print(" ");
            }
            //Numbers
            for(int k =row;k>=num;k--){
                System.out.print(k+" ");
            }
            num--;
            System.out.println();
        }
    }
}
