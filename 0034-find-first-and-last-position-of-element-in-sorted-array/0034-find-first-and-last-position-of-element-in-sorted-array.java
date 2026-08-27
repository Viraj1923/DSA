class Solution {
    public int[] searchRange(int[] arr, int target) {
        int first = -1;
        int last = -1;

        // Find first
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] >= target) {
                if (arr[mid] == target) {
                    first = mid;
                }
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        // Find last
        l = 0;
        r = arr.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] <= target) {
                if (arr[mid] == target) {
                    last = mid;
                }
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return new int[]{first, last};
    }
}