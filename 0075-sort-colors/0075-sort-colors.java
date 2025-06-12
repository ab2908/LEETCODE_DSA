class Solution{
    public void sortColors(int[] nums){
        int n= nums.length;
        for(int i=0;i<=n-1;i++){
            int j=i;
            while(j>0 && nums[j-1]>nums[j]){
                swap(nums,j-1,j);
                j--;
            }
        }
    }
    public void swap(int[] nums,int start,int end){
        int temp= nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
}