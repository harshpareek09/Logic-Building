package Pattern.Triangle;

import java.util.Scanner;

public class ReverseNumberRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = sc.nextInt();


        for(int i =0;i<row;i++){
            for(int j = 0;j<(row-i);j++){
                System.out.print((j+1)+" ");
            }
            
            System.out.println();
        }
    }
}
