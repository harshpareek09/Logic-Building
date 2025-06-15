package Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ElementAppearInListNTimes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.print("Enter elements to be added: ");
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arrayList.add(i, sc.nextInt());
        }
        System.out.println("Enter value of N: ");
        int freq = sc.nextInt();

        System.out.println("List is: " + arrayList);

        for(int i =0;i<arrayList.size();i++){
            int ele = arrayList.get(i);
            int count = 0;
            for(int j = 0;j<arrayList.size();j++){
                if(ele == arrayList.get(j)) {
                    count++;
                }
            }
            if(count == freq){
                System.out.println(ele);
                break;
            }
        }
    }
}
