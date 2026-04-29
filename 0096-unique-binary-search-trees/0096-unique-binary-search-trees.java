class Solution {
    public int numTrees(int n) {
        int[] uniqTree=new int[n + 1];
        for (int i=0;i<=n;i++) {
            uniqTree[i]= 1;
        }
        for (int i=2;i<=n;i++) {
            int total = 0;
            for (int j=1;j<=i;j++){
                total += uniqTree[j- 1]* uniqTree[i- j];
            }
            uniqTree[i]=total;
        }
        return uniqTree[n];   
    }
}