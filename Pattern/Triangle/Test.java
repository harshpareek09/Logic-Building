package Pattern.Triangle;

public class Test {
    public static void main(String[] args) {
        int row = 5;
        int space = row -1;

        for(int i =1;i<=row;i++){
            
            for(int j =1;j<=space;j++){
                System.out.println(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.println(j+" ");
            }
            System.out.println();
            space--;
        }
    }
}
