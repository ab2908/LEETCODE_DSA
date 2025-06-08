import java.lang.Math;
class Solution {
    public int maxSubArray(int[] nums) {
        return maxSubArray(nums, 0, nums.length-1);
    }
    public int maxSubArray(int[] nums,int start,int end){
        if(start==end){
            return nums[start];
        }
        int mid=(start+end)/2;
        int maxleft=maxSubArray(nums,start,mid);
        int maxright=maxSubArray(nums,mid+1,end);
        int maxac=maxacross(nums,start,mid,end);
        int result=Math.max(Math.max(maxleft,maxright),maxac);
        return result;
    }
    public int maxacross(int[] nums,int low,int mid,int high){
        int leftsum=-9999;
        int rightsum=-9999;
        int sum=0;
        for(int i=mid;i>=low;i--){
            sum=sum+nums[i];
            if(sum>leftsum){
                leftsum=sum;
            }
        } 
        sum=0;
        for(int i=mid+1;i<=high;i++){
            sum=sum+nums[i];
            if(sum>rightsum){
                rightsum=sum;
            }
        }
        return leftsum+rightsum;

    }
}