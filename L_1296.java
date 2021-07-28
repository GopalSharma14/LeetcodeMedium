class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        int len= nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int n : nums )
            map.put(n, map.getOrDefault(n,0)+1);
        for(int n : map.keySet())
            pq.add(n);
        while(!pq.isEmpty()){
            int curr = pq.poll();
            if(map.get(curr)==0)
                continue;
            int times = map.get(curr);
            for(int i=1;i<k;i++){
                if(!map.containsKey(curr+i) || map.get(curr+i)<times)
                    return false;
                map.put(curr+i, map.get(curr+i)-times);
            }
        }
        return true;
    }
}