class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(0, new ArrayList<>(), s, result);
        return result;
    }
    public static void backtrack(int index, List<String> current,String s, List<List<String>> result){
        if (index == s.length()) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = index; i < s.length(); i++) {
            if (isPalindrome(s, index, i)) {
                current.add(s.substring(index, i + 1));
                backtrack(i + 1, current, s, result);
                current.remove(current.size() - 1);
            }
        }
    }
    public static boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}