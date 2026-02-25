class Solution {
    public int arrangeCoins(int n) {
        if(n == 1) return 1;
        int count = 0;
        int i = 1;
        while(n >= i){
            n = n - i;
            i = i + 1;
            count++;
        }
        return count;
    }
}