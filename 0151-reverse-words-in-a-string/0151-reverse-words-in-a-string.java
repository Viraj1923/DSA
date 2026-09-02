class Solution {
    public String reverseWords(String s) {
        StringBuilder str=new StringBuilder();

        s=s.trim();
        String strArr[]=s.split("\\s+");

        for(int i=strArr.length-1;i>=0;i--){
            str.append(strArr[i]);
            str.append(" ");
        }
        
        return str.toString().trim();
    }
}