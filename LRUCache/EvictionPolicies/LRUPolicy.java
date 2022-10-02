package LRUCache.EvictionPolicies;

import java.util.Map;

import LRUCache.Algorithms.DoublyLinkedList;
import LRUCache.Algorithms.DoublyLinkedListNode;

public class LRUPolicy<Key> implements EvictionPolicy<Key> {

    DoublyLinkedList<Key> dll;
    Map<Key, DoublyLinkedListNode<Key>> map;

    public LRUPolicy(DoublyLinkedList<Key> dll, Map<Key, DoublyLinkedListNode<Key>> map) {
        this.dll = dll;
        this.map = map;
    }

    @Override
    public void keyAccessed(Key key) {
        // TODO Auto-generated method stub

        if(map.containsKey(key) ==false){
            // DoublyLinkedListNode<Key> newNode =new DoublyLinkedListNode<Key>(key);
            DoublyLinkedListNode<Key> newNode = dll.insertByValLast(key);
            map.put(key,newNode);
        }else{
            DoublyLinkedListNode<Key> oldNode = map.get(key);
            dll.deleteByNode(oldNode);
            dll.insertByNodeLast(oldNode);
        }
        
    }


    @Override
    public Key evictKey() {
        // TODO Auto-generated method stub

        DoublyLinkedListNode<Key> headNode =dll.headNode;
        if(headNode == null)
            return null;

        dll.deleteByNode(headNode);
        return headNode.val;
    }
    
}
