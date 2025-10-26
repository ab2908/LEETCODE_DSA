class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=0;
        int high=maxelement(piles);
        int ans= Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            int totalhr= totalHours(piles,mid);
            if(totalhr<=h){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int maxelement(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        return max;
    }
    public int totalHours(int[] arr,int hour){
        int sum1=0;
        for(int i=0;i<arr.length;i++){
            sum1+= Math.ceil((double)arr[i]/(double)hour);
        }
        return sum1;
    }
}