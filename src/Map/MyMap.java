package Map;

import java.util.ArrayList;
import java.util.List;

public class MyMap<K, V> {
    private List<K> keys;
    private List<V> values;

    public MyMap() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    public void put(K key, V value) {
        if (keys.contains(key)) {
            int index = keys.indexOf(key);
            values.set(index, value);
        } else {
            keys.add(key);
            values.add(value);
        }
    }

    public V get(K key) {
        if (keys.contains(key)) {
            int index = keys.indexOf(key);
            return values.get(index);
        } else {
            return null;
        }
    }

    public V remove(K key) {
        if (keys.contains(key)) {
            int index = keys.indexOf(key);
            keys.remove(index);
            return values.remove(index);
        } else {
            return null;
        }
    }
}
