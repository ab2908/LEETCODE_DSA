class Solution {
    public int subarraySum(int[] nums, int k) {
    int n= nums.length;
    Map<Integer,Integer> mpp= new HashMap<>();
    int ps= 0;
    int count= 0;
    mpp.put(0, 1);
    for (int i = 0; i < n; i++) {
        ps += nums[i];
        int remove = ps - k;
        count += mpp.getOrDefault(remove, 0);
        mpp.put(ps, mpp.getOrDefault(ps, 0) + 1);
    }
    return count;
    }    
    
}