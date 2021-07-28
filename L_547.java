class Solution {
    public int findCircleNum(int[][] isConnected) {
        int count=0;
        int[] visited = new int[isConnected.length];
        for(int i=0;i<isConnected.length;i++){
            if(visited[i]==0){
                callHelp(isConnected, visited, i);
                count++;
            }
        }
        return count;
    }
    
    public void callHelp(int[][] isConnected, int[] visited, int i){
        for(int j=0;j<isConnected.length;j++){
            if(visited[j]==0 && isConnected[i][j]==1){
                visited[j]=1;
                callHelp(isConnected, visited,j);
            }
        }
}
}