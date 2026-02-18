class Solution {
    public boolean hasAlternatingBits(int n) {
        int [] a = new int[100];
        int i = 0;
        while( n != 0){
            a[i] = n % 2;
            i++;
            n = n / 2;
        }
        int j = 1;
        int k = 0;
        while(j <= i - 1){
            if(a[j] == a[k]){
                return false;
            }
            j++;
            k++;
        }
        return true;
    }
}