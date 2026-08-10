class Solution {
    public int rob(int[] nums) {
        int ind=nums.length;
        int[] dp= new int[ind];
        Arrays.fill(dp,-1);

        return solve(ind-1,dp,nums);
    }

    public int solve(int ind,int[] dp,int[] nums){
        if(ind==0) return nums[0];
        if(ind==1) return Math.max(nums[0], nums[1]);
        if(dp[ind]!=-1) return dp[ind];
        int take= nums[ind] + solve(ind-2,dp,nums);
        int nottake= 0+ solve(ind-1,dp,nums);
        dp[ind]= Math.max(take,nottake);
        return dp[ind];
        
    }
}