class Solution {
    public boolean isPowerOfFour(int n) {
        if(n <= 0 || n >= 2147483647) return false;
        if(n == 1) return true;
        long base = 1;
        for(int i = 0 ;i <= n;i++){
            base = base * 4;
            if(base >= 2147483647) return false;
            if(base == n) return true;
        }
        return false;
    }
}