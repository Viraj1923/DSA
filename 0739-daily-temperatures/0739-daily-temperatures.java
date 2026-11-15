class Solution {
    public int[] dailyTemperatures(int[] temp) {
         Stack<Integer> st = new Stack<>();
        int result[] = new int[temp.length];

        for (int i = 0; i < temp.length; i++) {
            while (!st.isEmpty() && temp[st.peek()] < temp[i]) {
                int idx = st.pop();
                result[idx] = i - idx;
            }
            st.push(i);
        }

        return result;
    }
}