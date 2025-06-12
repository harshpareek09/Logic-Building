package Pattern.Triangle;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entera row: ");
        int row = sc.nextInt();
        int num = row;

        for(int i =1;i<=row;i++){
            //Space
            for(int j =i-1;j>=1;j--){
                System.out.print(" "+" ");
            }

            //number
            for(int j = num;j>=1;j--){
                System.out.print(j+" ");
            }
            num--;
            System.out.println();
        }
        sc.close();
    }
}
