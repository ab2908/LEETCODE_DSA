class Solution {
        class Tuple{
            int dis;
            int row;
            int col;

            Tuple(int dis, int row, int col){
                this.dis=dis;
                this.row=row;
                this.col=col;
            }
        }
        public int shortestPathBinaryMatrix(int[][] grid) {
            int n= grid.length;
            if(grid[0][0]==1 || grid[n-1][n-1]==1){
                return -1;
            }

            int[][] dist= new int[n][n];
            for(int i=0;i<n;i++){
                Arrays.fill(dist[i],(int) 1e9);
            }
            Queue<Tuple> q= new LinkedList<>();
            dist[0][0]=1;
            q.add(new Tuple(1,0,0));
            int[] drow={-1,-1,0,1,1,1,0,-1};
            int[] dcol={-1,0,1,1,0,-1,-1,1};
            while(!q.isEmpty()){
                Tuple it= q.poll();
                int dis=it.dis;
                int r=it.row;
                int c=it.col;

                if(r==n-1 && c==n-1){
                    return dis;
                }

                for(int i=0;i<8;i++){
                    int newr= r+drow[i];
                    int newc= c+dcol[i];
                    if(newr>=0 && newr<n &&
                       newc>=0 && newc<n &&
                       grid[newr][newc]==0 &&
                       dis+1< dist[newr][newc]){

                        dist[newr][newc]= dis+1;
                        q.add( new Tuple(dis+1,newr,newc));
                    }
                }
            }
            return -1;

    }
}