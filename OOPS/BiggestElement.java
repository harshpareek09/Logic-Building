package OOPS;

class Biggest {
    private int[] arr;

    Biggest(int array[]){
        arr = array;
    }

    public void display(){
        if(arr.length<=0){
            System.out.println("Array is Empty!!!");
            
        }

        int max = arr[0];

        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        System.out.println("Maximum in Array is: "+max);


    }
}

public class BiggestElement{
    public static void main(String[] args) {
        int arr[] = {10,-7,18,90,64,23};
        Biggest obj = new Biggest(arr);
        obj.display();
    }
}


