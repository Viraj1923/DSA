class Solution {
    public String longestPalindrome(String s) {
        int longest_length=0;
        String longest="";

        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(pal(s.substring(i,j+1))){
                    String substr=s.substring(i,j+1);
                    if(substr.length()>longest_length){
                        longest=substr;
                        longest_length=substr.length();

                    }
                }
            }
        }
        return longest;
    }
    public static boolean pal(String substr){
        int i=0;
        int j=substr.length()-1;

        while(i<j){
            if(substr.charAt(i)!=substr.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
}