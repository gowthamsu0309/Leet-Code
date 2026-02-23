class Solution {
    public long sumAndMultiply(int n) {
        long rem = 0;
        long sum = 0;
        long x = 0;
        long mul = 0;
        while(n != 0){
            rem = n % 10;
            if(rem != 0){
                sum += rem; 
                mul = mul * 10 + rem;
            }
            n = n / 10;
        }
        while(mul != 0){
            rem = mul % 10;
            x = x * 10 + rem;
            mul = mul / 10;
        }
        long res = sum * x;
        return res;
    }
}