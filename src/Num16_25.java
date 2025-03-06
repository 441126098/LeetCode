import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class LRUCache {
    private Map<Integer,Integer> m = new HashMap<Integer,Integer>();
    private Map<Integer,Integer> order = new TreeMap<Integer,Integer>();

    private int size;
    public LRUCache(int capacity) {
        this.size = capacity;
    }

    public int get(int key) {
        order.put(key,0);
        return m.get(key);
    }

    public void put(int key, int value) {
        if (m.size()+1<this.size) {
            m.put(key, value);
            order.put(key, 0);
        }

    }
}
