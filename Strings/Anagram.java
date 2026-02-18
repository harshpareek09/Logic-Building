package Strings;

public class Anagram {
    public static void main(String[] args) {
        String str_1 = "Silent";
        String str_2 = "listen";

        //Ignore case sensitive
        str_1 = str_1.toLowerCase();
        str_2 = str_2.toLowerCase();

        //To check Anagram or not
        boolean isAnagram = true;

        //Check length First 
        if(str_1.length() != str_2.length()){
            isAnagram = false;
        }
        else{
            //Logic for Anagram Check
            for(int i =0;i<str_1.length();i++){
                char ch = str_1.charAt(i);
                boolean found = false;
                for(int j = 0;j<str_1.length();j++){
                    if(ch == str_2.charAt(j)){
                        found  = true;
                        break;
                        
                    }
                }

                if(found == false){
                    isAnagram = false;
                    break;
                }
            }

            if(isAnagram == true){
                System.out.println(str_1+" is Anagram of "+str_2);
            }
            else{
                System.out.println(str_1+" is NOT Anagram of "+str_2);
            }
        }


        /*
          String str1 = "silent";
        String str2 = "listen";

        if(str1.length() != str2.length()){
            System.out.println("Not an Anagram");
        }else{
            int freqOne[] = new int[256];
            int freqTwo[] = new int[256];
            for(int i =0;i<str1.length();i++){
                char ch = str1.charAt(i);
                freqOne[ch]++;
            }
            for(int i = 0;i<str2.length();i++){
                char ch = str2.charAt(i);
                freqTwo[ch]++;
            }
            boolean flag = true;
            for(int i = 0;i<freqOne.length;i++){
                if(freqOne[i] != freqTwo[i]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println("Anagram String");
            }else{
                System.out.println("Not a anagram");
            }
        }  
        */
    }
}
