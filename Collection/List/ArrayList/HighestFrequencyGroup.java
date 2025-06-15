package Collection.List.ArrayList;


import java.util.ArrayList;
import java.util.Scanner;

public class HighestFrequencyGroup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.print("Enter elements to be added: ");
        int size = sc.nextInt();

        for (int i =0;i<size;i++){
            System.out.print("Enter element "+(i+1)+": ");
            arrayList.add(i,sc.nextInt());
        }
        System.out.println("List Before Arranging Frequency Wise: "+arrayList);


        ArrayList<Integer> result = new ArrayList<>();
        while(!arrayList.isEmpty()){
            int element = arrayList.get(0);
            int frequency = 0;

            //Count frequency
            for(int i =0;i<arrayList.size();i++){
                if(arrayList.get(i) == element){
                    frequency++;
                }
            }
            for(int i =0;i<frequency;i++){
                result.add(element);
            }

            for(int i =0;i<arrayList.size();i++){
                if(arrayList.get(i) == element){
                    arrayList.remove(i);
                }
            }
        }

        System.out.println(result);
    }
}
