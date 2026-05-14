class Solution {
    public boolean isGood(int[] nums) {
        int m = 0;
        for (int x : nums) {
            m=Math.max(m, x);
        }
        if (nums.length!=m+1)
            return false;
        int[] freq=new int[m+1];
        for (int x:nums) {
            if (x<1 || x>m)
                return false;
            freq[x]++;
        }
        for(int i=1;i<m;i++){
            if (freq[i]!=1)
                return false;
        }
        return freq[m]==2;
    }
}