class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] out = new int[k];
        int count=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1 );
        }
        List<Map.Entry<Integer,Integer>> list = new LinkedList<>(map.entrySet());
        list.sort((a,b)-> -Integer.compare(a.getValue() ,b.getValue()));
        for(int i=0;i<k;i++)
                  out[i]= list.get(i).getKey();
        return out;
    }
}