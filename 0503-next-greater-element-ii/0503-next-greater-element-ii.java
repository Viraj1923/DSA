class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int[] result = new int[n];

        Arrays.fill(result, -1);

        for (int i = 0; i < 2 * n; i++) {
            int index = i % n;
            int current = nums[index];

            while (!st.isEmpty() && current > nums[st.peek()]) {
                int poppedIndex = st.pop();
                result[poppedIndex] = current;
            }

            if (i < n) {
                st.push(index);
            }
        }

        return result;
    }
}
