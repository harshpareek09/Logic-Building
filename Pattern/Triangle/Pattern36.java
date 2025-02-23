package Pattern.Triangle;
import java.util.Scanner;

public class Pattern36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a row: ");
        int row = sc.nextInt();

        for(int i =1;i<=row;i++){
            for(int j =1;j<=i;j++){
                if(j == 1 || j == i||i==row){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
