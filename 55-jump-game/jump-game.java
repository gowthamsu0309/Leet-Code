class Solution {
    public boolean canJump(int[] nums) {
        //if(nums.length<=1)return  true;
        int max=0;
        int i=0;
        while(i<nums.length){
            max = Math.max(max,nums[i]+i);
            if(max==nums.length-1)return true;
           // i++;
            if(i==max)return false;i++;
        }
        return true;
    }
}