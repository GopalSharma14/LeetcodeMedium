class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        int[] prev = intervals[0];
        List<int[]> list = new ArrayList<>();
        list.add(prev);
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=prev[1]){
                prev[1]= Math.max(prev[1],intervals[i][1]);
            }
            else{
                prev= intervals[i];
                list.add(prev);
            }
        }
        return list.toArray(new int[list.size()][2]);
    }
}