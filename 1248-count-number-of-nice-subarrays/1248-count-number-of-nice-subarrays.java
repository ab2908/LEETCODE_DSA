class Solution {
    public int numberOfSubarrays(int[] nums, int k){
        return atmost(nums,k) - atmost(nums,k-1);
    }
    public int atmost(int[] nums,int k){
       if(k<0) return 0;
       int l=0,r=0,cnt=0,sum=0;
       while(r<nums.length){
          sum=sum+(nums[r]%2);
          while(sum>k){
            sum=sum-(nums[l]%2);
            l++;
          }
          cnt=cnt + (r-l+1);
          r++;
       }
       return cnt; 
    }
}