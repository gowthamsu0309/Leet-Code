class Solution {
    public int smallestEqual(int[] nums) {
        int min = 9999;
        for(int i = 0;i < nums.length;i++){
            if(i % 10 == nums[i]){
                if(i < min){
                    min = i;
                }
            }
        }
        if(min == 9999) return -1;
        return min;
    }
}