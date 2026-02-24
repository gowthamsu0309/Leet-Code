class Solution {
    public int maxProduct(int n) {
        int [] a = new int[1000000];
        int rem = 0;
        int i = 0;
        while(n != 0){
            rem = n % 10;
            a[i++] = rem;
            n = n / 10;
        }
        int max = 0;
        for(int j = 0;j < i;j++){
            for(int k = j + 1;k < i;k++){
                if((a[j] * a[k]) > max){
                    max = a[j] * a[k];
                }
            }
        }
        return max;
    }
}