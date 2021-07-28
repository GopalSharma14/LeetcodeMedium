class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] visited = new int[numCourses];
        List<List<Integer>> adjList = new ArrayList<>(numCourses);
        
        for(int i=0;i<numCourses;i++){
            adjList.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            adjList.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        
        for(int i=0;i<numCourses;i++){
            if(!topologicalSort(adjList,i,visited))
                return false;
        }
        return true;
    }
    
    public boolean topologicalSort(List<List<Integer>> adjList,int i, int[] visited){
        if(visited[i]==2) return true;
        if(visited[i]==1) return false;
        visited[i]=1;
        for(Integer  j: adjList.get(i)){
            if(!topologicalSort(adjList,j,visited))
                return false;
        }
        visited[i]=2;
        return true;
    }
}