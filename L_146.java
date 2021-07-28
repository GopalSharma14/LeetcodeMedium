class LRUCache {
    
    private Map<Integer,Integer> map;
    private int capacity;

    public LRUCache(int capacity) {
        map= new LinkedHashMap<>();
        this.capacity= capacity;
    }
    
    public int get(int key) {
        if(!map.containsKey(key))
            return -1;
        int value= map.get(key);
        map.remove(key);
        map.put(key,value);
        return value;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key))
           map.remove(key);
        else if(capacity==map.size())
            map.remove(map.keySet().iterator().next());
        map.put(key,value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */