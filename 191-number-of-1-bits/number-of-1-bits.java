class Solution {
    public int hammingWeight(int n) {
        int [] a = new int[21474];
        int i = 0;
        while(n != 0){
            a[i++] = n % 2;
            n = n / 2;
        }
        int count = 0;
        for(int j = 0;j < i;j++){
            if(a[j] == 1){
                count++;
            }
        } 
        return count;
    }
}