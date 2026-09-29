class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backtrack(0, 0, n, new StringBuilder(), list);
        return list;
    }

    private static void backtrack(int open, int close, int n, StringBuilder current, List<String> list) {
        if (open == n && close == n) {
            list.add(current.toString());
            return;
        }
        
        if (open < n) {
            current.append('(');
            backtrack(open + 1, close, n, current, list);
            current.deleteCharAt(current.length() - 1);
        }

        if (close < open) {
            current.append(')');
            backtrack(open, close + 1, n, current, list);
            current.deleteCharAt(current.length() - 1);
        }
    }
}