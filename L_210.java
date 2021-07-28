class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] visited = new int[numCourses];
        List<List<Integer>> adjList = new ArrayList<>(numCourses);
        Stack<Integer> stack = new Stack<>();
        int[] result= new int[numCourses];
        
        for(int i=0;i<numCourses;i++)
            adjList.add(new ArrayList<>());
        for(int i=0;i<prerequisites.length;i++)
            adjList.get(prerequisites[i][1]).add(prerequisites[i][0]);
        
        for(int i=0;i<numCourses;i++){
            if(!topologicalSort(adjList,stack,i,visited))
                return new int[0];
        }
        int j=0;
        while(!stack.isEmpty()){
            result[j++]=stack.pop();
        }
        return result;   
    }
    
    public boolean topologicalSort(List<List<Integer>> list, Stack<Integer> stack, int v, int[] visited){
        if(visited[v]==2) return true;
        if(visited[v]==1) return false;
        visited[v] =1;
        
        for(Integer u : list.get(v)){
            if(!topologicalSort(list,stack,u,visited))
            return false;
        }
        visited[v]=2;
        stack.push(v);
        return true;
        
    }
}