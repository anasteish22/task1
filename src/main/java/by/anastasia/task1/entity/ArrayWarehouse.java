package by.anastasia.task1.entity;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class ArrayWarehouse {
    private static final ArrayWarehouse instance = new ArrayWarehouse();
    private Map<Integer, ArrayStatistics> map = new HashMap<>();

    private ArrayWarehouse() {
    }

    public static ArrayWarehouse getInstance() {
        return instance;
    }

    public ArrayStatistics put(Integer key, ArrayStatistics value) {
        return map.put(key, value);
    }

    public ArrayStatistics remove(Object key) {
        return map.remove(key);
    }
}
