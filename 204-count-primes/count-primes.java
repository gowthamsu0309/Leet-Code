class Solution {
    public int countPrimes(int n) {
       // if(n == 2) return 0;
        boolean [] prime = new boolean[n+1];
        int count = 0;

        for(int i = 0;i <= n;i++){
            prime[i] = true;
        }
        for(int p = 2;p * p <= n;p++){
            if(prime[p]){
                for(int k = p * p; k  <= n; k +=p){
                    prime[k] = false;
                }
            }
        }
        for(int i = 2;i < n;i++){
            if(prime[i]){
                count++;
            }
        }
     return count;   
    }
}