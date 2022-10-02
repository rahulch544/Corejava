package LRUCache.Factory;

import LRUCache.CustomException.StorageFullException;
import LRUCache.EvictionPolicies.EvictionPolicy;
import LRUCache.StorageAlgo.Storage;

public class CacheFactory<Key,Value> {
    
    public final Storage<Key, Value> storage;
    public final EvictionPolicy<Key> evictionPolicy;

    public CacheFactory(Storage<Key, Value> storage, EvictionPolicy<Key> evictionPolicy) {
        this.storage = storage;
        this.evictionPolicy = evictionPolicy;
    }

    public void put(Key key, Value value) {
        try{
            storage.add(key, value);
            evictionPolicy.keyAccessed(key);

        }catch(StorageFullException e){

            Key keyToRemove = evictionPolicy.evictKey();
            
            storage.remove(keyToRemove);
            put(key, value);
        }
    }  
    
    public Value get(Key key){
        try{
            Value value = storage.get(key);
            evictionPolicy.keyAccessed(key);
            return value;
        }catch(Exception e){
            return null;
        }
    }

}
