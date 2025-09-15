class Solution {
    public static int lowerbound(int []nums,int n,int target){
    int low=0;
    int high=n-1;
    int first=n;
    while(low<=high){
        int mid=(low+high)/2;
        if(nums[mid]>=target){
            first=mid;
            high=mid-1;
        }
        else{
            low=mid+1;
        }
    }
    return first;
    }
    public static int upperbound(int []nums,int n,int target){
    int low=0;
    int high=n-1;
    int end=n;
    while(low<=high){
        int mid=(low+high)/2;
        if(nums[mid]>target){
            end=mid;
            high=mid-1;
        }
        else{
            low=mid+1;
        }
    }
    return end;
    }   
    
    public int[] searchRange(int[] nums, int target) {
    int n= nums.length;
    int lb= lowerbound(nums,n,target);
    if(lb==n || nums[lb]!=target){
        return new int[]{-1 ,-1};
    }
    return new int[]{lb,upperbound(nums,n,target)-1};
    }
}