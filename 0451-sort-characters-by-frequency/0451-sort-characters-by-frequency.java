class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        StringBuilder st= new StringBuilder();

        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        List<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort((a,b) -> b.getValue() - a.getValue());

        for (Map.Entry<Character, Integer> entry : list) {
            char ch = entry.getKey();
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                st.append(ch);
            }
        }
        return st.toString();


    }
}