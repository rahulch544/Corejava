package LRUCache.Algorithms;

public class DoublyLinkedListNode<E> {
    
    public E val;
    public DoublyLinkedListNode<E> next;
    public DoublyLinkedListNode<E> prev;

    /**
     * @param val
     */
    public DoublyLinkedListNode(E val) {
        this.val = val;
        next = null;
        prev = null;
    }

    public E getVal() {
        return val;
    }

    public void setVal(E val) {
        this.val = val;
    }

    public DoublyLinkedListNode<E> getNext() {
        return next;
    }

    public void setNext(DoublyLinkedListNode<E> next) {
        this.next = next;
    }

    public DoublyLinkedListNode<E> getPrev() {
        return prev;
    }

    public void setPrev(DoublyLinkedListNode<E> prev) {
        this.prev = prev;
    }

    
}
