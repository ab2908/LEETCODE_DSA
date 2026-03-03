class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n= s.length();
        int maxlen= 0;
        Map<Character,Integer> freq= new HashMap<>();
        int l=0;int r=0;
        while(r<n){
            char right=s.charAt(r);
            freq.put(right,freq.getOrDefault(right,0)+1);
            while(freq.get(right)>1){
                char left= s.charAt(l);
                freq.put(left,freq.get(left)-1);
                l++;
            }

            maxlen=Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
    }
}