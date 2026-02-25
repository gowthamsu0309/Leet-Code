class Solution {
    public int countDigits(int num) {
        int rem = 0,count = 0,temp = num;
        while(num != 0){
            rem = num % 10;
            if(temp % rem == 0)count++;
            num = num / 10;
        }
        return count;
    }
}