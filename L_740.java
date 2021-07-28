class Solution {
    public int deleteAndEarn(int[] nums) {
        if(nums.length<=1)
            return nums.length==1? nums[0]:0;
        int[] count = new int[10001];
        int max=0;
        for(int n: nums){
            count[n]++;
            max=Math.max(max,n);
        }
        int[] dp = new int[max+1];
        dp[0]=count[0];
        dp[1]=count[1];
        for(int i=2;i<=max;i++)
            dp[i]=Math.max(count[i]*i+dp[i-2],dp[i-1]);
        return dp[max];
    }
}