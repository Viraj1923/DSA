class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (backtrack(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean backtrack(char[][] board, String word,int row, int col, int index) {
        if (index == word.length()) {
            return true;
        }

        if (row < 0 || row >= board.length ||
            col < 0 || col >= board[0].length) {
            return false;
        }

        if (board[row][col] != word.charAt(index)) {
            return false;
        }

        char original = board[row][col];
        board[row][col] = '#';

        boolean found =
            backtrack(board, word, row - 1, col, index + 1) || // up
            backtrack(board, word, row + 1, col, index + 1) || // down
            backtrack(board, word, row, col - 1, index + 1) || // left
            backtrack(board, word, row, col + 1, index + 1);   // right

        board[row][col] = original;
        return found;
    }
}