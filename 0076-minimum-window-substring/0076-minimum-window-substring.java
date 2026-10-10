class Solution {
    public String minWindow(String s, String t) {
        int left = 0;
        int formed = 0;

        int minWindowLen = Integer.MAX_VALUE;
        int minWindowStart = 0;

        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        for (char ch : t.toCharArray()) {
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }

        int required = need.size();

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            window.put(ch, window.getOrDefault(ch, 0) + 1);

            if (need.containsKey(ch) &&
                need.get(ch).equals(window.get(ch))) {
                formed++;
            }

            while (formed == required) {
                int windowLen = right - left + 1;

                if (windowLen < minWindowLen) {
                    minWindowLen = windowLen;
                    minWindowStart = left;
                }

                char leftChar = s.charAt(left);

                if (need.containsKey(leftChar) &&
                    window.get(leftChar).equals(need.get(leftChar))) {
                    formed--;
                }

                window.put(leftChar, window.get(leftChar) - 1);
                left++;
            }
        }

        if (minWindowLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(minWindowStart, minWindowStart + minWindowLen);
    }
}