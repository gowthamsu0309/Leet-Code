class Solution {
    public int largestAltitude(int[] gain) {
        int [] pref = new int[gain.length];
        pref[0] = gain[0];
        for(int i = 1;i < gain.length;i++){
            pref[i] = gain[i] + pref[i-1];
        }
        int max = 0;
        for(int i = 0;i < gain.length;i++){
            if(pref[i] > max){
                max = pref[i];
            }
        }
        return max;
    }
}