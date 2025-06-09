class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int temp;
        boolean flag;
        for (int i=0;i<n-1;i++) {
            flag=false;
            for (int j=0;j<n-i-1;j++) {
                if (nums[j] >nums[j + 1]) {
                    temp = nums[j];
                    nums[j] =nums[j + 1];
                    nums[j + 1] = temp;
                    flag=true;
                }
            }
            if (flag==false)
                break;
        }
    }
}