class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int max=Integer.MIN_VALUE;
        int su=0;
        for(int x:weights){
            su+=x;
            if(x>max){
                max=x;
            }
        }
        int low=max;
        int high=su;
        while(low<=high){
            int mid=(low+high)/2;
            int dayreq= find(weights,mid);
            if(dayreq<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }

    public int find(int[] nums,int cap){
        int day=1;
        int load=0;
        for(int i=0;i<nums.length;i++){
            if(load+nums[i]>cap){
                day++;
                load=nums[i];
            }
            else{
                load+=nums[i];
            }
        }
        return day;
    }
}