class Solution {
    public int fib(int n) {
        int sum = 0;
        if(n == 0) return 0;
        if(n == 1) return 1;
        for(int i = n - 1 ;i >= n - 2;i--){
            sum = sum + fibo(i);
        }
        return sum;        
    }
    int fibo(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}