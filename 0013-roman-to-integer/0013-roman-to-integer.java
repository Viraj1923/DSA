class Solution {
    public int romanToInt(String s) {
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int total=0;

        for (int i = 0; i < s.length(); i++) {
            int currVal = map.get(s.charAt(i));
            int nextVal = 0;
            if (i + 1 < s.length()) {
                nextVal = map.get(s.charAt(i + 1));
            }

            if (currVal < nextVal) {
                total -= currVal;
            } else {
                total += currVal;
            }
        }
        return total;
    }
}