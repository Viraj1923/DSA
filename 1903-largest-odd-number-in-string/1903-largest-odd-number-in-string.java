class Solution {
    public String largestOddNumber(String num) {
        StringBuilder str=new StringBuilder();

        for(int i=num.length()-1;i>=0;i--){
            char ch=num.charAt(i);
            int digit=ch - '0';
            if(digit % 2 ==1){
                int l=0;
                while(l<=i){
                    str.append(num.charAt(l));
                    l++;
                }
                return str.toString();
            }
        }
        return "";
    }
}