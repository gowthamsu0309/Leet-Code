class Solution {
    public boolean isHappy(int n) {
        int slow = n,fast = n;
        do{
            slow = get(slow);
            fast = get(get(fast));
        }while(slow != fast);
        if (slow == 1){
            return true;
        }
        return false;
    }
    int get(int n){
        int sum = 0;
        while(n != 0){
            int rem = n % 10;
            sum += rem * rem;
            n = n / 10;
        }
        return sum;
    }
}