package Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class AllTargetPairsSum {
    public static void main(String[] args) {
        ArrayList<Integer> arrLst = new ArrayList<>(Arrays.asList(2, 4, 3, 5, 7, -1, 0, 1));
        int target = 6;

        for (int i = 0; i < arrLst.size(); i++) {
            for (int j = i + 1; j < arrLst.size(); j++) {
                if (arrLst.get(i) + arrLst.get(j) == target) {
                    System.out.println("( " + arrLst.get(i) + ", " + arrLst.get(j) + " )");
                }
            }
        }
    }
}
