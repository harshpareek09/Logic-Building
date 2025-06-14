package Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrangePositiveNegativeAlternative {
    public static void main(String[] args) {
        ArrayList <Integer> arrList = new ArrayList<>(Arrays.asList(1,-2,3,-4,-5,6));
        System.out.print("Before Rearranging: ");
        System.out.println(arrList);

        for (int i =0;i<arrList.size();i++){

            //For Positive number
            if((i%2 ==0) && arrList.get(i)<0){
                //Find next positive
                for(int j = i+1;j<arrList.size();j++){
                    if(arrList.get(j)>0){
                        int temp = arrList.get(i);
                        arrList.set(i, arrList.get(j));
                        arrList.set(j,temp);
                        break;
                    }
                }
            }

            //For negative number
            if((i%2 !=0) && arrList.get(i)>0){
                //Find next negative
                for(int j = i+1;j<arrList.size();j++){
                    if(arrList.get(j)<0){
                        int temp = arrList.get(i);
                        arrList.set(i, arrList.get(j));
                        arrList.set(j,temp);
                        break;
                    }
                }
            }
        }
        System.out.print("After Rearranging Array List is: ");
        System.out.println(arrList);
    }
}
