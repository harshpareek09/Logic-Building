package Pattern.Triangle;
import java.util.Scanner;
public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = sc.nextInt();

        for(int i = row;i>=1;i--){
            //Space
            for(int j = 1;j<= row-i;j++){
                System.out.print(" ");
            }
            //Numbers
            for(int k =1;k<=i;k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
