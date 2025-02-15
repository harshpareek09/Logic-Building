package Strings;

public class NumberOFWordsInString {
    public static void main(String[] args) {
        String str = "I am a Spider Man";

        String result[] = str.split(" ");

        for(int i =0;i<result.length;i++){
            System.out.print(result[i]);
        }
        System.out.println("\n"+result.length);

    }
}
