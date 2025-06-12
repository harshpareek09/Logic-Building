package Pattern.Triangle;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a row: ");
        int row = sc.nextInt();

        for(int i =1;i<=row;i++){

            for(int j =1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j =i-1;j>=1;j--){
                System.out.print(j+" ");
            }

            System.out.println();
        }
        sc.close();
    }
}
