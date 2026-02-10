class Solution {
    public int dominantIndices(int[] nums) {
        int count = 0;
        int n = nums.length - 1;
        int [] suf = new int[nums.length];
        suf[nums.length -1 ] = nums[nums.length -1 ];
        for(int i = suf.length - 2;i >= 0;i--){
            suf[i] = suf[i+1] + nums[i];
        }
        for(int i = 0;i < nums.length -1;i++){
            int temp = suf[i+1];
            int div = Math.abs(n - i);
            if(nums[i] > temp / div ){
                count++;
            }
        }
        return count;
    }
}