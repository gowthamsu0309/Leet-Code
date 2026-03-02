class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int [] a = new int[2];
        int i = 0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int num : nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() == 2){
                a[i] = entry.getKey();
                i++;
            }
        }      
        return a;
    }
}