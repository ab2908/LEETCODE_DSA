class Solution {
    public int[][] merge(int[][] intervals) {
        int n =intervals.length;
        int[][] ans=new int[n][2];
        int idx=-1;
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        for(int i=0;i<=n-1;i++){
            int start=intervals[i][0];
            int end= intervals[i][1];
            if(idx !=-1 && end<=ans[idx][1]){
                continue;
            }
            for(int j=i+1;j<n;j++){
                if(intervals[j][0]<=end){
                    end=Math.max(end, intervals[j][1]);
                }
                else{
                    break;
                }
            }
            idx++;
            ans[idx][0]= start;
            ans[idx][1]= end;
        }
    int[][] result = new int[idx + 1][2];
    for(int k=0;k<=idx;k++){
            result[k][0] = ans[k][0];
            result[k][1] = ans[k][1];
    }

    return result;

    }
    
}