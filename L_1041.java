class Solution {
    public boolean isRobotBounded(String instructions) {
        int[][] dir =  {{0,1},{-1,0},{0,-1},{1,0}};
        int pos=0;
        int x=0;
        int y=0;
        for(int i=0;i<instructions.length();i++){
            if(instructions.charAt(i)=='G'){
                x+=dir[pos][0];
                y+=dir[pos][1];
            }
            else if(instructions.charAt(i)=='R')
                pos=(pos+3)%4;
            else
                pos= (pos+1)%4;
        }
        return x==0 && y==0 || pos!=0;
    }
}