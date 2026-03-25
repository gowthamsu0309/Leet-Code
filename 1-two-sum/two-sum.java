class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] res = new int[2];
        int i = 0,j = 1;
        while(i < nums.length){
            if(nums[i]+nums[j] == target){
                res[0] = i;
                res[1] = j;
                return res;
            }
            j++;
            if(j == nums.length){
                i = i+1;
                j = i+1;
            }
        }
        return res;
    }
}