package LRUCache.StorageAlgo;

import java.util.HashMap;
import java.util.Map;

import LRUCache.CustomException.NotFoundException;
import LRUCache.CustomException.StorageFullException;

public class HashMapStorage<Key,Value> implements Storage<Key,Value>{

    private final Map<Key,Value> map;
    private final Integer capacity;

    public HashMapStorage( Integer capacity) {
        this.map = new HashMap<Key,Value>();
        this.capacity = capacity;
    }

    @Override
    public Boolean add(Key key, Value value) {
        if (isStorageFull()) throw new StorageFullException();

        map.put(key, value);
        return true;
    }

    @Override
    public Boolean remove(Key key) {
        // TODO Auto-generated method stub
        if(map.containsKey(key)){
            map.remove(key);
        }else{
            throw new NotFoundException();
        }
        return true;
    }

    @Override
    public Value get(Key key) throws NotFoundException {
        // TODO Auto-generated method stub
        if(map.containsKey(key)){
            return map.get(key);
        }else{
            throw new NotFoundException();
        }
    }

    private boolean isStorageFull() {
        return map.size() == capacity;
    }
    
}
