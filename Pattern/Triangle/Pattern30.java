package Pattern.Triangle;

public class Pattern30 {
    public static void main(String[] args) {
        int row = 5;
        int star = row;
        for(int i =1;i<=row;i++){
            for(int j =1;j<i;j++){
                System.out.print(" ");
            }
            for(int k =1;k<=star;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
            star--;
        }
    
    }
}
