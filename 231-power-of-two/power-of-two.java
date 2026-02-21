class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 1) return true;
        if(n >= 2147483647 || n < 0) return false;
        long base = 1;
        for(int i = 1;i <= n;i++){
            base = base * 2;
            if(base >= 2147483647) return false;
            if(base == n){
                return true;
            }
        }
        return false;
    }
}