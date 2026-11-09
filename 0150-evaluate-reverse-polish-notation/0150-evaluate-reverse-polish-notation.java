class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int num2 = st.pop();
                int num1 = st.pop();
                int res = 0;

                if (token.equals("+")) res = num1 + num2;
                else if (token.equals("-")) res = num1 - num2;
                else if (token.equals("*")) res = num1 * num2;
                else if (token.equals("/")) res = num1 / num2;

                st.push(res);
            } else {
                st.push(Integer.parseInt(token));
            }
        }

        return st.pop();
    }
}