class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int res = -1;
        for(int i = 0; i < n; i++)
        {
            if(target == nums[i])
            {
                res = i;
                break;
            }
        }
        return res;
    }
}