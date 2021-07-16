
package com.bridgelabs;

public class MyNode<K> implements INode<K>{
    K key;
    INode next;

    public MyNode() {
    }

    public MyNode(K key) {
        this.key = key;
        this.next = null;
    }

    @Override
    public void setKey(K key) {
        this.key = key;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setNext(INode<K> next) {
        this.next = next;
    }

    @Override
    public INode<K> getNext() {
        return next;
    }
}