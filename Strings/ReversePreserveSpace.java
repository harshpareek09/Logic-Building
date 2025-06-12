package Strings;
public class ReversePreserveSpace{
    public static void main(String args[]){
        String str = "I am not a string";
        String reverse = "";
        int end = str.length()-1;

        for(int i =0;i<str.length();i++){
            //For giving space at smart
            if(str.charAt(i) == ' '){
                reverse = reverse+" ";
                
            }
            else{
                //For skiping space at reverse
                if(str.charAt(end) ==' '){
                    end--;
                }
                reverse = reverse+str.charAt(end);
                end--;
            }

            
        }
        System.out.println("Without Reverse: "+str);
        System.out.println("With Reverse and Preserve Space: "+reverse);
    }
} 