class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        fun(ans, nums,0,list);
        return list;   
    }
    public static void fun(List<Integer> ans, int [] nums, int i, List<List<Integer>> list){
        if(i==nums.length){
            list.add(new ArrayList<>(ans));
            return ;
        }
        ans.add(nums[i]);
        fun(ans, nums,i+1,list);
        ans.remove(ans.size() - 1);
        fun(ans,nums,i+1,list);
    }
}