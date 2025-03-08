package Arrays;
public class OccurenceOfEachElement {
    public static void main(String[] args) {
        int arr[] = {8,4,8,2,4,7,9,2};

        System.out.println("Array Before Sorting ");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        //Sort the Array
        for(int i =0;i<arr.length-1;i++){
            for(int j =0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        //Array after sort
        System.out.println("Array After Sorting");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        for(int i =0;i<arr.length;i++){

            if(i>0 && arr[i] == arr[i-1]){
                continue;
            }

            int num = arr[i];
            int count =1;
            for(int j = i+1;j<arr.length;j++){
                if(num == arr[j]){
                    count++;
                }
            }
            System.out.println("Count of "+arr[i]+" is: "+count);
        }

    }
}
