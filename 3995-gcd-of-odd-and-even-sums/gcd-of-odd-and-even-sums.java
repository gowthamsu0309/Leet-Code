class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumEven = 0;
        int sumOdd = 0;
        for(int i = 1;i <= n * 2;i++){
            if(i % 2 == 0){
                sumEven += i;
            }
            else{
                sumOdd += i;
            }
        }
        int min = 0;
        int max = 0;
        if(sumEven < sumOdd){
            max = sumOdd;
            min = sumEven;
        }
        else{
            max = sumEven;
            min = sumOdd;
        }
        int rem = 0;
        while(max != 0){
            rem = min % max;
            min = max;
            max = rem;
        }
        return min;
    }
}