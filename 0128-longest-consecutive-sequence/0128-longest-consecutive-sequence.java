class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int length = 0;
        for(int i:nums ){
            set.add(i);
        }
        for(int i:set){
            if(!set.contains(i-1)){
                int curr=i;
                int streak=1;
                while(set.contains(curr+1)){
                    curr++;streak++;
                }
                length=Math.max(length,streak);
            }

        }
        return length;
    }
}