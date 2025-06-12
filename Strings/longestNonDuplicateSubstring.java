package Strings;
public class longestNonDuplicateSubstring {
    public static void main(String[] args) {
        String str= "abcabcbb";
        int maxLength = 0;
        String longestSubstring = "";


        for(int i =0;i<str.length();i++){
            String currentSubstring = "";
            boolean visited[] = new boolean[256];

            for(int j =i;j<str.length();j++){
                if(visited[str.charAt(j)]==true){
                    break;
                }

                visited[str.charAt(j)]= true;
                currentSubstring = currentSubstring+str.charAt(j);

                if(currentSubstring.length()>maxLength){
                    maxLength = currentSubstring.length();
                    longestSubstring = currentSubstring;
                }
            }
        }

        System.out.println(longestSubstring);
    }
}
