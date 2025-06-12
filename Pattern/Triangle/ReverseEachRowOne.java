package Pattern.Triangle;
import java.util.*;
public class ReverseEachRowOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a row: ");
        int row = sc.nextInt();

        for(int i =1;i<=row;i++){
            for(int j =i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
