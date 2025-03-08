package Strings;

public class RwverseStringUsingNewString {
    public static void main(String[] args) {
        String str = "I Love Javaaaaa!!!!!";
        char result[] = new char[str.length()];
        int start = 0;

        System.out.println("String Before reverse is: "+str);


        for(int i = str.length()-1;i>=0;i--){
            result[start] = str.charAt(i);
            start++;
        }

        String New = new String(result);
        
        System.out.println("String After Reverse is: "+New);
    }
}
