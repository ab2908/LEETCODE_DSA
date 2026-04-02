class Pair{
    int first;
    int second;
    public Pair(int f,int s){
        this.first=f;
        this.second=s;
    }
}
class Solution {
       public void bfs(int row,int col,int[][] vis,char[][] grid){
        vis[row][col]=1;
        Queue<Pair> q=new LinkedList<Pair>();
        q.add(new Pair(row,col));
        int[] drow= {-1, 0, 1, 0};
        int[] dcol= {0, 1, 0, -1};
        while(!q.isEmpty()){
            int row1=q.peek().first;
            int col1=q.peek().second;
            q.remove();
        
            for (int i= 0;i<4;i++){
                int nrow= row1+ drow[i];
                int ncol= col1+ dcol[i];
                if (nrow>=0 && nrow<grid.length && ncol>=0&& ncol<grid[0].length &&
                    grid[nrow][ncol]=='1' && vis[nrow][ncol]==0){
                        bfs(nrow,ncol,vis,grid);
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] vis=new int[n][m];
        int cnt=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (grid[i][j] =='1' && vis[i][j]==0){
                   cnt++;
                   bfs(i,j,vis,grid);
                }
            }
        }
        return cnt;
    }
}