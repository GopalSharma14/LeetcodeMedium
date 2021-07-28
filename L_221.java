class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length==0)
            return 0;
        int rows = matrix.length;
        int cols= matrix[0].length;
        int max=0;
        int[][] dp =new int[rows][cols];
        for(int i=0;i<rows;i++){
            dp[i][0]=matrix[i][0]=='0'?0:1;
            max= Math.max(dp[i][0],max);
        }
        for(int i=0;i<cols;i++){
            dp[0][i]=matrix[0][i]=='0'?0:1;
            max= Math.max(dp[0][i],max);
        }
        
        for(int i=1;i<rows;i++){
            for(int j=1;j<cols;j++){
               if(matrix[i][j]=='1'){
                   dp[i][j]=1+Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1]);
                   max=Math.max(dp[i][j],max);
               }
            }
        }
        return max*max;
    }
    
}