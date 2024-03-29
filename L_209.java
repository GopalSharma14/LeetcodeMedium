class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums.length==0)
            return 0;
        int sum=0;
        int left=0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        while(sum>=target){
            min= Math.min(min, i-left);
            sum-=nums[left++];
        }
            
        }
        return min==Integer.MAX_VALUE? 0 : min+1;
            
        
    }
}