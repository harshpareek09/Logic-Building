package Arrays;

public class MergeTwoArrayinSortedWithoutDuplicate {
    public static void main(String[] args) {
        int arr_one[] = { 8, 2, 7, 7, 6, 5, 4, 8 };
        int arr_two[] = { 60, 69, 82, 64 };

        int merge[] = new int[arr_one.length + arr_two.length];

        // Add Elements in Merge Array
        int count = 0;
        for (int i = 0; i < arr_one.length; i++) {
            merge[i] = arr_one[i];
            count++;
        }

        for(int i =0;i<arr_two.length;i++){
            merge[count] = arr_two[i];
            count++;
        }

        //Merge Array is
        System.out.println("Array Merged: ");
        for(int ele:merge){
            System.out.print(ele+" ");
        }
        System.out.println();

        //Sort the arraray
        for(int i =0;i<merge.length-1;i++){
            for(int j =0;j<merge.length-i-1;j++){
                if(merge[j]>merge[j+1]){
                    int temp = merge[j];
                    merge[j] = merge[j+1];
                    merge[j+1] = temp;
                }
            }
        }

        

        //Remove Duplicacy
        int unique = 1;
        for(int i =1;i<merge.length;i++){
            if(merge[i]!=merge[i-1]){
                merge[unique] = merge[i];
                unique++;
            }
        }

        //Removing End values
        for(int i =0;i<=merge.length-unique;i++){
            merge[unique] = 0;
            unique++;
        }
        
        //Array after sorting
        System.out.println("Array Merged and Sort also: ");
        for(int ele:merge){
            System.out.print(ele+" ");
        }
        System.out.println();

        

    }
}
