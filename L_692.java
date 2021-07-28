class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        ArrayList<String> list1 = new ArrayList<>();
        int count=0;
        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1 );
        }
        List<Map.Entry<String,Integer>> list = new LinkedList<>(map.entrySet());
        list.sort((a,b)-> a.getValue()==b.getValue() ? a.getKey().compareTo(b.getKey()) : 
                                                                             b.getValue() - a.getValue());
        
        for(int i=0;i<k;i++){
            list1.add(list.get(i).getKey());
        }
        return list1;
    }
}