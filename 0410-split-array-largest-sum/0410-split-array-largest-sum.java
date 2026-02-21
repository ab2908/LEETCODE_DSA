class Solution {
    public int countPartitions(int[] a, int maxSum) {
        int partitions=1;
        long subarr=0;
        for (int num:a) {
            if (subarr+num<=maxSum) {
                subarr+=num;
            } else{
                partitions++;
                subarr=num;
            }
        }
        return partitions;
    }

    public int splitArray(int[] nums, int k) {

        int low=0, high=0;
        for (int num:nums) {
            low=Math.max(low, num);
            high+=num;
        }
        while (low<=high) {
            int mid=low +(high-low)/2;
            int partitions=countPartitions(nums, mid);
            if (partitions>k) {
                low=mid+1;
            } else{
                high=mid-1;
            }
        }
        return low;
    }
}