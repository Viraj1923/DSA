class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for (String op : operations) {
            if (op.equals("C")) {
                st.pop();
            } else if (op.equals("D")) {
                st.push(st.peek() * 2);
            } else if (op.equals("+")) {
                int top = st.pop();
                int newScore = top + st.peek();
                st.push(top);
                st.push(newScore);
            } else {
                st.push(Integer.parseInt(op));
            }
        }

        int totalSum = 0;
        while (!st.isEmpty()) {
            totalSum += st.pop();
        }
        return totalSum;
    }
}