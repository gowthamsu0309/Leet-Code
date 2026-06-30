class Solution {
    public int trap(int[] height) {
        int left = 1,right = height.length - 2;
        int lmax = height[0];
        int rmax = height[right + 1];
        int res = 0;
        while(left <= right){
            if(rmax <= lmax){
                res +=Math.max(0,rmax - height[right]);
                rmax = Math.max(rmax,height[right]);
                right--;
            }
            else{
                res += Math.max(0,lmax - height[left]);
                lmax = Math.max(lmax,height[left]);
                left++;
            }
        }
        return res;
    }
}