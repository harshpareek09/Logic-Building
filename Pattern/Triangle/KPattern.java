package Pattern.Triangle;
import java.util.Scanner;
public class KPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a row: ");
        int row = sc.nextInt();

        int star = row;

        for(int i =1;i<=row;i++){
            for(int j =1;j<=star;j++){
                System.out.print(j+" ");
            }
            System.out.println();
            star--;
        }

        for(int i=2;i<=row;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        sc.close();

    }
}
