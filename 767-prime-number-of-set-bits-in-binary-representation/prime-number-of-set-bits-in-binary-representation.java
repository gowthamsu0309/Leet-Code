class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        boolean [] prime = new boolean[right+1];
        for(int i = 0;i < right;i++){
            prime[i] = true;
        }
        prime[0] = false;
        prime[1] = false;
        for(int i = 2;i * i <= right;i++){
            if(prime[i]){
                for(int p = i * i;p <= right; p += i){
                    prime[p] = false;
                }
            }
        }
        for(int i = left;i <= right;i++){
            int bit = Integer.bitCount(i);
            if(prime[bit]){
                count++;
            }
        }
        return count;
    }
}