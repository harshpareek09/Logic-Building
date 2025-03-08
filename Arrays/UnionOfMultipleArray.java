package Arrays;

public class UnionOfMultipleArray {
    public static void main(String[] args) {
        int arr_one[] ={2,3,4,7,1};
        int arr_two[] ={4,1,3,5};
        int arr_three[] ={8,4,6,2,1};
        int arr_four[] ={7,9,4,1};
        int index =0;

        int sizeNew = arr_one.length+arr_two.length+arr_three.length+arr_four.length;

        int UnionArray[] = new int[sizeNew];

    

        index = addElement(arr_one,UnionArray,index);
        index = addElement(arr_two,UnionArray,index);
        index = addElement(arr_three,UnionArray,index);
        index = addElement(arr_four,UnionArray,index);

        System.out.println("Union of Arrays are: ");
        for(int i=0;i<index;i++){
            System.out.print(UnionArray[i]+" ");
        }
        System.out.println();


    
    }

    public static int addElement(int arr[],int result[],int currentIdx){

        for(int i =0;i<arr.length;i++){
            int num= arr[i];
            boolean flag = false;

            for(int j =0;j<currentIdx;j++){
                if(num == result[j]){
                    flag = true;
                    break;
                }
            }

            if(flag == false){
                result[currentIdx] = arr[i];
                currentIdx++;
            }


        }
        return currentIdx;
    }
}
