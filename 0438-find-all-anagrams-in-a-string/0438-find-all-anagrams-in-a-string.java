class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        int l=0;
        int r=p.length()-1;

        while(r<s.length()){
            if(isAnagram(s,p,l,r)){
                list.add(l);
            }
            l++;
            r++;
            
        }
        return list;
    }

    public static boolean isAnagram(String s, String p, int l, int r) {
        int[] freq = new int[26];

        for (int i = 0; i < p.length(); i++) {
            freq[p.charAt(i) - 'a']++;
        }

        for (int i = l; i <= r; i++) {
            freq[s.charAt(i) - 'a']--;
        }

        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    // public static boolean isAnagram(String str,String p){
    //     if(str.length()!=p.length()) return false;
        
    //     HashMap<Character,Integer> map=new HashMap<>();
    //     for(char ch:str.toCharArray()){
    //         map.put(ch,map.getOrDefault(ch,0)+1);
    //     }

    //     for(int i=0;i<p.length();i++){
    //         char ch=p.charAt(i);
    //         if(!map.containsKey(ch)){
    //             return false;
    //         }
    //         map.put(ch,map.get(ch)-1);
    //         if(map.get(ch)==0){
    //             map.remove(ch);
    //         }
    //     }
    //     return map.isEmpty();

    // }
}