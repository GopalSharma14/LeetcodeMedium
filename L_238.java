class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] out = new int[n];
        out[0] = 1;
        int factor=1;
        for(int i=1;i<n;i++){
            out[i]=out[i-1]*nums[i-1];
        }
        for(int i=n-1;i>=0;i--){
            out[i]=out[i]*factor;
            factor=factor*nums[i];
        }
        return out;
    }
}