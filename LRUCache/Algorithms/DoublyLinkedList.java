package LRUCache.Algorithms;

import LRUCache.CustomException.InvalidElementException;

public class DoublyLinkedList<Key> {

    public  DoublyLinkedListNode<Key> headNode;
    public  DoublyLinkedListNode<Key> tailNode;
    

    public DoublyLinkedList(DoublyLinkedListNode<Key> headNode, DoublyLinkedListNode<Key> tailNode) {
        this.headNode = headNode;
        this.tailNode = tailNode;
    }

    public DoublyLinkedList() {
        headNode = null;
        tailNode = null;
    }

    public DoublyLinkedListNode<Key> insertByValLast(Key key){
        if(key == null){
            throw new InvalidElementException("InvalidElementException");
        }

        DoublyLinkedListNode<Key> newNode = new DoublyLinkedListNode<Key>(key);
        insertByNodeLast(newNode);

        return newNode;

    }
    public DoublyLinkedListNode<Key> insertByNodeLast(DoublyLinkedListNode<Key> node){
        try{
            if(headNode == null){
                headNode = node;
                tailNode = node;
            }else{
                tailNode.next = node;
                node.prev=tailNode;
                tailNode = node;
            }
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
        return tailNode;
    }
    

    public Key deleteByNode(DoublyLinkedListNode<Key> node){
        if(node == null) return null;

        if(node.equals(headNode)){
            headNode = headNode.next;

            if(headNode != null){
                headNode.prev =null;
            }
 
        }else if(node.equals(tailNode)){
            tailNode = tailNode.prev;

            if(tailNode.next !=null){
                tailNode.next = null;
            }
        }else{
            node.next.prev = node.prev;
            node.prev.next = node.next;
        }
        node.next =null;
        node.prev =null;
        return node.val;

    }

    public DoublyLinkedListNode<Key> getHeadNode() {
        return headNode;
    }

    public void setHeadNode(DoublyLinkedListNode<Key> headNode) {
        this.headNode = headNode;
    }

    public DoublyLinkedListNode<Key> getTailNode() {
        return tailNode;
    }

    public void setTailNode(DoublyLinkedListNode<Key> tailNode) {
        this.tailNode = tailNode;
    }

    
}



