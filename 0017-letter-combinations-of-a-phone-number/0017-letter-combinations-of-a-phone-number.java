class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        String[] arr = {"", "", "abc", "def", "ghi","jkl", "mno", "pqrs", "tuv", "wxyz"};
        backtrack(0, new StringBuilder(), digits, arr, result);
        return result;
    }

    public static void backtrack(int index,StringBuilder current,String digits,String[] arr,List<String> result) {

        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        int digit = digits.charAt(index) - '0';
        String letters = arr[digit];

        for (int i = 0; i < letters.length(); i++) {
            current.append(letters.charAt(i));
            backtrack(index + 1, current, digits, arr, result);
            current.deleteCharAt(current.length() - 1);
        }
    }
}