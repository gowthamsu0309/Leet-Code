class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int s = n * n;
        while(s != 0){
            if(s * w <= maxWeight){
                return s;
            }
            s--;
        }
        return 0;
    }
}