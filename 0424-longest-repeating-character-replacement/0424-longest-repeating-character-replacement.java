class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int[] freq = new int[26];
        int maxLen = 0, maxFreq = 0, l = 0, r = 0;

        while (r < n) {
            char ch = s.charAt(r);
            freq[ch - 'A']++;
            maxFreq = Math.max(maxFreq, freq[ch - 'A']);

            int windowLength = r - l + 1;

            if (windowLength - maxFreq > k) {
                freq[s.charAt(l) - 'A']--;
                l++;
            }

            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }

        return maxLen;
    }
}