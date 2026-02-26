class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ls = new ArrayList<>();
        for(int i = left;i <= right;i++){
            int res = selfCheck(i);
            if(res == 0){
                ls.add(i);
            }
        }
        return ls;
    }
    int selfCheck(int n){
        int temp = n;
        while(n != 0){
            int rem = n % 10;
            if(rem == 0 || temp % rem != 0){
                return 1;
            }
            n = n / 10;
        }
        return 0;
    }
}