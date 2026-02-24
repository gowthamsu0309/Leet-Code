class Solution {
    public long removeZeros(long n) {
        long rem  = 0;
        long sum = 0;
        while(n != 0){
            rem = n % 10;
            if(rem != 0)sum = sum * 10 + rem;
            n = n / 10;
        }
        long temp = 0;
        while(sum != 0){
            rem = sum % 10;
            temp =  temp * 10 + rem;
            sum = sum / 10;
        }
        return temp;
    }
}