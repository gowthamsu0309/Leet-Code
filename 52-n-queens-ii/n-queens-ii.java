class Solution {
    public int totalNQueens(int n) {
        boolean[] cols = new  boolean[n];
        boolean[] diag1 = new boolean[2 * n];
        boolean[] diag2 = new boolean[2 * n];

        return solve(0,cols, diag1,diag2,n);
    }
    public int solve(int row, boolean[] cols,boolean[] diag1,boolean[] diag2,int n){
        int count = 0;
        if(row == n){
            return 1;
        }
        for(int col = 0;col < n;col++){
            if(!cols[col] && !diag1[row - col + n] && !diag2[row + col]){
                cols[col] = diag1[row - col + n] = diag2[row + col] = true;
                count += solve(row+1,cols,diag1,diag2,n);
                cols[col] = diag1[row - col + n] = diag2[row + col] = false;
            }
        }
        return count;
    }
}