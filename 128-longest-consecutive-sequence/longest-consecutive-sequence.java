class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        Set<Integer> hs = new HashSet<>();
        for(int num : nums){
            hs.add(num);
        }
        int longStreak = 0;
        for(int num : hs){
            int currnum = 0;
            int currStreak = 0;
            if(!hs.contains(num - 1)){
                currnum = num;
                currStreak = 1;

                while(hs.contains(currnum+1)){
                    currnum += 1;
                    currStreak += 1;
                }
                longStreak = Math.max(longStreak,currStreak);
            }
           
        }
        return longStreak;
    }
}