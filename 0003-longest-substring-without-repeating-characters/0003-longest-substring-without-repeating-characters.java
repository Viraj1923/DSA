class Solution {
    public int lengthOfLongestSubstring(String s) {
       int maxLength=0;
       int l=0;
       int r=0;
       HashSet<Character> set=new HashSet<>();

       while(r<s.length()){
            char ch=s.charAt(r);
            if(!set.contains(ch)){
                set.add(ch);
                r++;
                maxLength=Math.max(maxLength,r-l);
            }else{
                set.remove(s.charAt(l));
                l++;
            }
       }
       return maxLength;
    }
}