package Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestIncreasingSublist {
    public static void main(String[] args) {
        ArrayList<Integer> arrLst = new ArrayList<Integer>(Arrays.asList(1, 2, 2, 3, 1, 4, 5));
        int tempstart = 0;//current sublist start
        int currlen = 1;// current sublist length
        int maxlen = 1;// Longest Sublist length
        int subliststart = 0;// Longest sublist start


        for(int i =1;i< arrLst.size();i++){
            if(arrLst.get(i) > arrLst.get(i-1) ){
                currlen++;
            }else{
                if(currlen>maxlen){
                    maxlen = currlen;
                    subliststart = tempstart;
                }
                currlen =1;
                tempstart = i;
            }
        }

        //if the sublist come at the end
        if(currlen>maxlen){
            maxlen = currlen;
            subliststart = tempstart;

        }

        List<Integer> sublist = arrLst.subList(subliststart, subliststart + maxlen);
        System.out.println(sublist);
    }
}
