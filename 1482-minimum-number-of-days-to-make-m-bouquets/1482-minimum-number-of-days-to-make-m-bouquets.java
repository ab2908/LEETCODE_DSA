class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        for (int bloom: bloomDay) {
            low=Math.min(low, bloom);
            high=Math.max(high, bloom);
        }
        int ans=high;
        if(n<(long)m*k) return -1;
        while(low<=high){
            int mid= (low+high)/2;
            if(possible(bloomDay,mid,m,k)==true){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return ans;
    }

    public boolean possible(int[] nums,int day,int m, int k ){
        int count=0; 
        int bouquets=0; 
        for (int bloom:nums){
            if (bloom<=day){
                count++;
                if (count==k){
                    bouquets++; 
                    count=0; 
                }
            }
            else{
                count=0; 
            }
        }
        return bouquets>=m; 
    }
}