class Solution {
    public int smallestNumber(int n, int t) {
        while(n <= 100){
            int p = product(n);
            if(p % t == 0){
                break;
            }
            n++;
        }
        return n;
    }
    int product(int n){
        int rem = 0;
        int pro = 1;
        while(n != 0){
            rem = n % 10;
            pro = pro * rem;
            n = n / 10;
        }
        return pro;
    }
}