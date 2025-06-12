package Pattern.Triangle;

import java.util.Scanner;

public class Pattern47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a row: ");
        int row = sc.nextInt();
        int time = row;

        for(int i =1;i<=row;i++){
            char ch = 65;
            for(int j=1;j<=time;j++){
                System.out.print(ch+" ");
                ch++;
            }
            time--;
            System.out.println();
        }
        sc.close();

    }
}
