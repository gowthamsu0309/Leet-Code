class Solution {
    public int mirrorDistance(int n) {
        int sum = 0;
        int rem = 0;
        int temp = n;
        while(n != 0){
            rem = n % 10;
            sum = sum * 10 + rem;
            n = n / 10;
        }
        return Math.abs(temp - sum);
    }
}