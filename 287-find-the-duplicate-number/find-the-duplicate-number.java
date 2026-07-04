class Solution {
    public int findDuplicate(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            if(set.contains(num)){
                return num;
            }
            set.add(num);
        }
        return 0;
    }
}