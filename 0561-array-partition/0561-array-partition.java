class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum1= 0;

        for(int i=nums.length-2;i>=0;i-=2){
            sum1 += nums[i];
        }
        return sum1; 
    }
}