class Solution {
    public boolean canJump(int[] nums) {
        int lastIndexPosition = nums.length-1;
        for(int i=lastIndexPosition-1;i>=0;i--){
            if(nums[i]+i>=lastIndexPosition){
                lastIndexPosition=i;
            }
        }
        return lastIndexPosition==0;
    }
}