class Solution {
    public int[] leftRightDifference(int[] nums) {
        int [] pref = new int[nums.length];
        pref[0] = 0;
        int [] res = new int[nums.length];
        for(int i = 1;i <= nums.length -1;i++){
            pref[i] = pref[i-1] + nums[i-1];
        }
        int [] suf = new int[nums.length];
        suf[nums.length - 1] = 0;
        for(int i = nums.length -2;i >=0;i--){
            suf[i] = suf[i + 1] + nums[i + 1];
        }
        for(int i = 0;i < nums.length;i++){
            res[i] = Math.abs(pref[i] - suf[i]);
        }
        return res;
    }
}