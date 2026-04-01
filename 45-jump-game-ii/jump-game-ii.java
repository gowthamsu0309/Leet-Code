class Solution {
    public int jump(int[] nums) {
        int max = 0;
        int curr = 0;
        int step = 0;
        for(int i = 0;i < nums.length - 1;i++){
            max = Math.max(max,i + nums[i]);
            if(i == curr){
                curr = max;
                step++;
            }
            if(curr > nums.length - 1){
                break;
            }
        }
        return step;
    }
}