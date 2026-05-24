class Solution {
    public int maximumLengthSubstring(String s){
        int[] freq=new int[26];
        int left=0,right=0,result=0;
        while (right<s.length()){
            int ind =(int)(s.charAt(right)-'a');
            freq[ind]++;
            while (freq[ind]>2 && left<s.length()) {
                freq[(int) (s.charAt(left)-'a')]--;
                left++;
            }
            result=Math.max(result, right-left+1);
            right++;
        }
        return result;  
    }
}