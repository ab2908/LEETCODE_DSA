class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj= new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int j=0;j<prerequisites.length;j++){
            adj.get(prerequisites[j][1]).add(prerequisites[j][0]);
        }
        int[] inDegree= new int[numCourses];
        for(int i=0;i<numCourses;i++){
            for(int it: adj.get(i)){
                inDegree[it]++;
            }
        }

        Queue<Integer> q= new LinkedList<Integer>();
        for(int i=0;i<numCourses;i++){
            if(inDegree[i]==0){
                q.add(i);
            }
        }
        int[] topo= new int[numCourses];
        int count=0;
        while(!q.isEmpty()){
            int cell= q.peek();
            q.remove();
            topo[count++]= cell;
            for (int it: adj.get(cell)) {
                inDegree[it]--;
                if (inDegree[it]== 0) {
                    q.add(it);
                }
            }
        }
        if(count==numCourses) return topo;
        int[] ans={};
        return ans;
    }
}