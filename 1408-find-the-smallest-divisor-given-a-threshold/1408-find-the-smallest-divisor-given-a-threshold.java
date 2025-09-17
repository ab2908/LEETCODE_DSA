class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = maxvalue(nums); // use max value, not index
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sum1(nums, mid) <= threshold) {
                ans = mid;
                high = mid - 1; // try smaller divisor
            } else {
                low = mid + 1;  // need bigger divisor
            }
        }
        return ans;
    }

    public int sum1(int[] nums, int div) {
        int s = 0;
        for (int i = 0; i < nums.length; i++) {
            s += (int)Math.ceil((double)nums[i] / div);
        }
        return s;
    }

    public int maxvalue(int[] nums) {
        int m = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > m) {
                m = nums[i];
            }
        }
        return m;
    }
}