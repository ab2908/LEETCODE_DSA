class Solution {
     List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        generate(0,new ArrayList<>(),candidates,target,0);
        return res;
    }
    public void generate(int index,List<Integer> curr,int[] candidates, int target,int sum){
        if(sum==target){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(sum>target || index>=candidates.length) return;
        curr.add(candidates[index]);
        generate(index,curr,candidates,target,sum+candidates[index]);
        curr.remove(curr.size()-1);
        generate(index+1,curr,candidates,target,sum);
    }
}