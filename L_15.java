class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int low=i+1;
            int high= nums.length-1;
            int sum=-nums[i];
            if(i==0 || nums[i]!=nums[i-1]){
                while(low<high){
                    if(nums[low]+nums[high]==sum){
                        list.add(Arrays.asList(nums[low],nums[high],nums[i]));
                        while(low<high && nums[low]==nums[low+1]) low++;
                        while(low<high && nums[high]==nums[high-1]) high--;
                        low++;
                        high--;
                    }else if(nums[low]+nums[high]>sum){
                        high--;
                    }else
                        low++;
                }
            }
        }
        return list;
    }
}