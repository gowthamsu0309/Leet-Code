class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        boolean [] prime = new boolean [nums.length+1];
        Arrays.fill(prime,true);
        prime[1] = false;
        for(int i = 2;i * i <= nums.length;i++){
            if(prime[i]){
                for(int p = i * i;p <= nums.length;p += i){
                    prime[p] = false;
                }
            }
        }
        Map<Integer,Integer> tree = new HashMap<>();
        for(int num : nums){
            tree.put(num,tree.getOrDefault(num,0)+1);
        }
        for(int key : tree.values()){
            if(prime[key] == true){
                return true;
            }
        }
        return false;
    }
}