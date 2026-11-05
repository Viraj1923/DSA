class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int MOD = 1_000_000_007;

        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> st = new Stack<>();

        // Step 1: Previous Less Element
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            left[i] = st.isEmpty() ? -1 : st.peek();

            st.push(i);
        }

        st.clear();

        // Step 2: Next Less Element
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            right[i] = st.isEmpty() ? n : st.peek();

            st.push(i);
        }

        // Step 3: Calculate contribution
        long sum = 0;

        for (int i = 0; i < n; i++) {
            long leftCount = i - left[i];
            long rightCount = right[i] - i;

            long contribution = (long) arr[i] * leftCount * rightCount;

            sum = (sum + contribution) % MOD;
        }

        return (int) sum;
    }
}
