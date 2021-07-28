class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        List<List<String>> list= new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            char [] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String word= String.valueOf(ch);
            if(map.containsKey(word)){
                map.get(word).add(strs[i]);
            }
            else{
                map.put(word,new ArrayList<>());
                map.get(word).add(strs[i]);
            }
        }
        for(Map.Entry<String,List<String>> entry : map.entrySet()){
            list.add(entry.getValue());
        }
        return list;
    }
}