class Solution {
    public int countEven(int num) {
        int sum = 0;
        for(int i = 1;i <= num;i++){
            int res = isEven(i);
            if(res % 2 == 0){
                sum++;
            }
        }
        return sum;
    }
    int isEven(int n){
        int rem = 0;
        int sum = 0;
        while(n != 0){
            rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        return sum;
    }
}