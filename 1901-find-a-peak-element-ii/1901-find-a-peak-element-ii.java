class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int l = 0;
        int r = n - 1;

        while (l <= r) {

            int mid = l + (r - l) / 2;

            int maxRow = 0;

            // Find maximum element in current column
            for (int i = 0; i < m; i++) {
                if (mat[i][mid] > mat[maxRow][mid]) {
                    maxRow = i;
                }
            }

            int maxElement = mat[maxRow][mid];

            int left = (mid == 0) ? -1 : mat[maxRow][mid - 1];
            int right = (mid == n - 1) ? -1 : mat[maxRow][mid + 1];

            if (maxElement > left && maxElement > right) {
                return new int[]{maxRow, mid};
            } 
            else if (maxElement < left) {
                r = mid - 1;
            } 
            else {
                l = mid + 1;
            }
        }

        return new int[]{-1, -1};
    }
}