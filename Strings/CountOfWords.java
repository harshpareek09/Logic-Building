package Strings;

public class CountOfWords {
    public static void main(String[] args) {
        String str = "I am a Spider Man";

        int count = 1;
        for(int i =0;i<(str.length())-1;i++){
            if(str.charAt(i+1) == ' ')
                count++;
        }
        System.out.println("Count of words in  a String is: "+count);
    }
}
