class Solution {
    public int subtractProductAndSum(int n) {
        int rem = 0;
        int sum = 0,pro = 1;
        while(n != 0){
            rem = n % 10;
            sum = sum + rem;
            pro = pro * rem;
            n = n / 10;
        }
        int res = pro - sum;
        return res;
    }
}