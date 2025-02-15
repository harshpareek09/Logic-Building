package Pattern.Triangle;

import java.util.Scanner;

public class ReverseEachRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a row: ");
        int row = sc.nextInt();

        
        for(int i =1;i<=row;i++){
           int star = row;
            for(int j =1;j<=i;j++){
                System.out.print(star+" ");
                star--;
            }
            
            System.out.println();
        }
    }
}
