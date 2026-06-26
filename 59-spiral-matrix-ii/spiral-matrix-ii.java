class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];

        int top = 0,bottom = n- 1;
        int left = 0,right = n - 1;
        int count = 1;
        while(count <= n * n){
            for(int i = left;i <= right;i++){
                mat[top][i] = count++;
            }
            top++;

            for(int i = top;i <= bottom;i++){
                mat[i][right] = count++;
            }
            right--;

            for(int i = right;i >= left;i--){
                mat[bottom][i] = count++;
            }
            bottom--;

            for(int i = bottom;i >= top;i--){
                mat[i][left] = count++;
            }
            left++;
        }
        return mat;
        
    }
}