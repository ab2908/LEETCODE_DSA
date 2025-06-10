class Solution{
    public void sortColors(int[] nums){
        int n= nums.length;
        for(int i=0;i<=n-2;i++){
            int min=i;
            for(int j=i;j<=n-1;j++){
                if(nums[j]<nums[min]){
                min=j;
                }
            }
            swap(nums,i,min);
        }
    }
    public void swap(int[] nums,int s,int t){
        int temp=nums[s];
        nums[s]=nums[t];
        nums[t]=temp;
    }
}