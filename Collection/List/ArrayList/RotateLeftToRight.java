package Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class RotateLeftToRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.print("Enter elements to be added: ");
        int size = sc.nextInt();

        for (int i =0;i<size;i++){
            System.out.print("Enter element "+(i+1)+": ");
            arrayList.add(i,sc.nextInt());
        }
        System.out.println("Enter number of rotations: ");
        int rotate = sc.nextInt();

        System.out.println("List Before Rotation: "+arrayList);

        int start = size -1;
        for(int i =1;i<=rotate;i++){
            for (int j = start;j>0;j--){
                int temp = arrayList.get(j);
                arrayList.set(j,arrayList.get(j-1));
                arrayList.set(j-1,temp);
            }
        }
        System.out.println(arrayList);

    }
}
