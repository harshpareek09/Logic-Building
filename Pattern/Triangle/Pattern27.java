package Pattern.Triangle;

public class Pattern27 {
    public static void main(String[] args) {
        int row = 5;
        for (int i = 1; i <= row; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= row; j++) {
                    if (j % 2 != 0) {
                        System.out.print("1" + " ");
                    } else {
                        System.out.print("0" + " ");
                    }
                }
            } else {
                for (int j = 1; j <= row; j++) {
                    if (j % 2 != 0) {
                        System.out.print("0" + " ");
                    } else {
                        System.out.print("1" + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}
