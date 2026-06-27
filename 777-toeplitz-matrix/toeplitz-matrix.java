class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length,n = matrix[0].length;

        for(int col = 0;col < n;col++){
            int r = 0, c = col;
            int val = matrix[r][c];
            while(r < m && c < n){
                if(val != matrix[r][c]){
                    return false;
                }
                r++;c++;
            }
        }
        for(int row = 1;row < m;row++){
            int r = row,c = 0;
            int val = matrix[r][c];
            while(r < m && c < n){
                if(val != matrix[r][c]){
                    return false;
                }
                r++;c++;
            }
        }
        return true;
    }
}