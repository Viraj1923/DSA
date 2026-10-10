class Solution {
    public int numberOfSubstrings(String s) {
        int left=0;
        int totalSub=0;

        HashMap<Character,Integer> map=new HashMap<>();

        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);

            while(map.size()==3){
                totalSub+=s.length()-right;
                if(map.get(s.charAt(left))==1){
                    map.remove(s.charAt(left));
                }else{
                    map.put(s.charAt(left),map.get(s.charAt(left))-1);
                }
                left++;
            }
    
        }
        return totalSub;
    }
}