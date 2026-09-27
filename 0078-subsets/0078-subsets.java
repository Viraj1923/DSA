class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        backtrack(0, nums, new ArrayList<>(), result);

        return result;
    }

    private void backtrack(int index, int[] nums,
                           List<Integer> current,
                           List<List<Integer>> result) {

        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // TAKE
        current.add(nums[index]);
        backtrack(index + 1, nums, current, result);

        // UNDO
        current.remove(current.size() - 1);

        // SKIP
        backtrack(index + 1, nums, current, result);
    }
}