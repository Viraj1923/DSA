class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();

        int l = 0;
        int r = p.length() - 1;

        while (r < s.length()) {

            if (isAnagram(s, p, l, r)) {
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
}