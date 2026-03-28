class Solution {
    List<List<String>> res;
    public List<List<String>> solveNQueens(int n) {
        res = new ArrayList<>();
        char[][] board = new char[n][n];
        boolean[] cols = new boolean[n];
        boolean[] diag1 = new boolean[2 * n];
        boolean[] diag2 = new boolean[2 * n];
        for(char[] row : board){
            Arrays.fill(row,'.');
        }

        backtrack(0, board, cols, diag1, diag2, n);

        return res;
    }

    void backtrack(int row,char[][] board,boolean[] cols,boolean[] diag1,boolean[] diag2,int n){

        if(row == n){
            res.add(construct(board));
            return;
        }

        for(int col = 0;col < n;col++){
            if(cols[col] || diag1[row - col + n] || diag2[row + col]){
                continue;
            }

            board[row][col] = 'Q';
            cols[col] = diag1[row - col + n] = diag2[row + col] = true;

            backtrack(row+1,board,cols,diag1,diag2,n);

            board[row][col] = '.';
            cols[col] = diag1[row - col + n] = diag2[row + col] = false;
        }
    }
    static List<String> construct(char[][] board){
        List<String> ls = new ArrayList<>();
        for(char[] row : board){
            ls.add(new String(row));
        }
        return ls;
    }
}