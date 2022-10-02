package LRUCache.StorageAlgo;

import LRUCache.CustomException.NotFoundException;
import LRUCache.CustomException.StorageFullException;

public interface Storage<Key, Value> {

    public Boolean add(Key key, Value value) throws StorageFullException;;

    public Boolean remove(Key key) throws NotFoundException;

    public Value get(Key key) throws NotFoundException;

    
}
