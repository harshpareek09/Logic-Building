package Pattern.Triangle;

public class Pattern26 {
    public static void main(String[] args) {
        int row = 5;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {

                if (j % 2 != 0) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print("0" + " ");

                }
            }
            System.out.println();
        }
    }
}
