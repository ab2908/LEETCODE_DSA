class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites){
        ArrayList<ArrayList<Integer>> adj= new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int j=0;j<prerequisites.length;j++){
            adj.get(prerequisites[j][0]).add(prerequisites[j][1]);
        }
        int[] inDegree= new int[numCourses];
        for(int i=0;i<numCourses;i++){
            for(int it: adj.get(i)){
                   inDegree[it]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                q.offer(i);
            }
        }
        int count=0;
        while (!q.isEmpty()) {
            int node =q.poll();
            count++;
            for (int it: adj.get(node)) {
                inDegree[it]--;
                if (inDegree[it]== 0) {
                    q.offer(it);
                }
            }
        }
        return count==numCourses;
        
    }
}