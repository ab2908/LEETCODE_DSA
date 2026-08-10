class Solution {
    public int rob(int[] nums) {
        int n= nums.length;
        if(n==1) return nums[0];
        int ans1= solve(0,n-2,nums);
        int ans2= solve(1,n-1,nums);

        return Math.max(ans1,ans2);
    }

    public int solve(int start, int end, int[] nums){
        int[] dp= new int[nums.length];
        Arrays.fill(dp,-1);
        return helper(end,start,dp,nums);
    }

    public int helper(int ind,int start,int[] dp,int[] nums){
        if(ind<start) return 0;
        if(ind==start) return nums[ind];
        if(dp[ind]!= -1) return dp[ind];
        int take= nums[ind] + helper(ind-2,start,dp,nums);
        int nottake= helper(ind-1,start,dp,nums);

        dp[ind]= Math.max(take,nottake);
        return dp[ind]; 
    }
}