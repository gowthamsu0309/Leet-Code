class Solution {
    public boolean checkDivisibility(int n) {
        int rem = 0;
        int sum = 0;
        int pro = 1;
        int temp = n;
        while(n != 0){
            rem = n % 10;
            sum = sum + rem;
            pro = pro * rem;
            n = n / 10; 
        }
        if(temp % (sum + pro) == 0) return true;
        return false; 
    }
}