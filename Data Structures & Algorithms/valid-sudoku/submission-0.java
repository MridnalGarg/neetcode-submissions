class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] row = new int[9];
        int[] col = new int[9];
        int[] square = new int[9];

        for(int r = 0; r<9; r++){
            for(int c = 0; c<9; c++){

                if(board[r][c] == '.') continue;

                int val = board[r][c] - '1';

                int flag = 1 << val;

                int k = (r / 3) * 3 + (c / 3);

                if(
                    (row[r] & flag) > 0
                    || (col[c] & flag) > 0
                    || (square[k] & flag) > 0
                ) return false;

                row[r] |= flag;
                col[c] |= flag;
                square[k] |= flag;
            }
        }
        return true;        
    }
}
