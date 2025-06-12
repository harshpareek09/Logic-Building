package Pattern.Triangle;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a row: ");
        int row = sc.nextInt();

        for(int i =1;i<=row;i++){
            for(int j = row;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
