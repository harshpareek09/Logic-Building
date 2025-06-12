package Pattern.Triangle;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a row: ");
        int row = sc.nextInt();

        int star = row;

        for(int i =1;i<=row;i++){
            for(int j = star;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
            star--;
        }
    }
}
