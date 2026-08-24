class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> list = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        int startRow = 0;
        int endRow = m - 1;

        int startCol = 0;
        int endCol = n - 1;

        while (startRow <= endRow && startCol <= endCol) {

            // Top → left to right
            for (int i = startCol; i <= endCol; i++) {
                list.add(matrix[startRow][i]);
            }

            // Right → top to bottom
            for (int j = startRow + 1; j <= endRow; j++) {
                list.add(matrix[j][endCol]);
            }

            // Bottom → right to left
            if (startRow < endRow) {
                for (int i = endCol - 1; i >= startCol; i--) {
                    list.add(matrix[endRow][i]);
                }
            }

            // Left → bottom to top
            if (startCol < endCol) {
                for (int j = endRow - 1; j > startRow; j--) {
                    list.add(matrix[j][startCol]);
                }
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }

        return list;
    }
}