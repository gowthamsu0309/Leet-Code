class Solution {
    public int findKthLargest(int[] nums, int k) {
        mergeSort(nums,0,nums.length - 1);
        return nums[nums.length - k];
    }
    public void mergeSort(int [] nums,int start,int end){
        if(start < end){
            int mid = (start + end) / 2;

            mergeSort(nums,start,mid);
            mergeSort(nums,mid + 1,end);

            merge(nums, start, mid, end);
        }
    }
    public void merge(int [] nums, int start, int mid, int end){
        int [] a = new int[end - start+1];
        int i = start,j = mid + 1,k = 0;
        while(i <= mid && j <= end){
            if(nums[i] < nums[j]){
                a[k] = nums[i];
                i++;
                k++;
            }
            else{
                a[k] = nums[j];
                j++;
                k++;
            }
        }
        if(i > mid){
            while(j <= end){
                a[k] = nums[j];
                j++;
                k++;
            }
        }
        else{
            while(i <= mid){
                a[k] = nums[i];
                i++;
                k++;
            }
        }
        k = 0;
        for(int l = start;l <= end;l++){
            nums[l] = a[k];
            k++;
        }

    }
}