package Arrays;

public class MergeTwoArrayWithDuplicacy {
    public static void main(String[] args) {
        int arr_one[] ={12,-7,18,9,3,-1,21};
        int arr_two[] ={27,18,21,6,3,-2,-1};

        int merge[] = new int[arr_one.length+arr_two.length];


        //print the sorted Array
        System.out.println("Array_one Before Merging and Sorting is: ");
        for(int ele:arr_one){
            System.out.print(ele+" ");
        }
        System.out.println();

        System.out.println("Array_two Before Merging and Sorting is: ");
        for(int ele:arr_two){
            System.out.print(ele+" ");
        }
        System.out.println();
        

        //Merge the Array
        int count = 0;
        for(int i =0;i<arr_one.length;i++){
            merge[count] = arr_one[i];
            count++;
        }
        for(int i =0;i<arr_two.length;i++){
            merge[count] = arr_two[i];
            count++;
        }

        //Sort the Array
        for(int i =0;i<merge.length-1;i++){
            for(int j =0;j<merge.length-i-1;j++){
                if(merge[j]>merge[j+1]){
                    int temp = merge[j];
                    merge[j] = merge[j+1];
                    merge[j+1] = temp;
                }
            }
        }


        //print the sorted Array
        System.out.println("Array After Merging and Sorting is: ");
        for(int ele:merge){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
