package Strings;

public class ReverseEachCharacter {
    public static void main(String[] args) {
        String str = "Todays Java Concept";
        char str_arr[] = str.toCharArray();
        int start = 0;
        int end = 0;

        for (int i = 0; i < str_arr.length; i++) {
            if(i== str_arr.length-1||str_arr[i+1] == ' '){
                end = i;

                while(start<end){
                    char temp = str_arr[start];
                    str_arr[start] = str_arr[end];
                    str_arr[end] = temp;

                    start++;
                    end--;
                }
                start = i+2;
            }
            
        }

        System.out.println("Original String: "+str);
        System.out.println("Reversed each word char: "+ new String(str_arr));
    }
}
