class Solution {
    public int maximumSum(int[] arr) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        if(max<0)
            return max;
        if(arr.length==1)
            return arr[0];
        int maxSum=0;
        int[] currSumWithDelete= new int[arr.length];
        int[] currSumWithoutDelete = new int[arr.length];
        currSumWithDelete[0]=0;
        currSumWithoutDelete[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            currSumWithoutDelete[i]= Math.max(arr[i],currSumWithoutDelete[i-1]+arr[i]);
            currSumWithDelete[i] =Math.max(currSumWithDelete[i-1]+arr[i],currSumWithoutDelete[i-1]);
            maxSum=Math.max(Math.max(currSumWithoutDelete[i],maxSum),currSumWithDelete[i]);
        }
        return maxSum;
    }
}