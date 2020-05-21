package com.algorithm.problems.leetcode.no146_lru_cache;

import java.util.HashMap;
import java.util.Map;

public class LRUCacheMap {

    private Map<Integer, LRUNode> cache;
    private LRUNode first;
    private LRUNode last;
    private int capacity;

    public LRUCacheMap(final int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        first = new LRUNode(0, -1);
        last  = new LRUNode(0, -1);
        first.next = last;
        last.prev = first;
    }

    public void put(final int key, final int value) {
        LRUNode newNode = new LRUNode(key, value);
        this.addFirstNode(newNode);
        cache.put(key, newNode);
        if (capacity < cache.size()) {
            this.removeLeastUsedNode();
        }
    }

    public int get(final int key) {
        if(this.cache.containsKey(key)) {
            LRUNode currentNode = cache.get(key);
            currentNode.prev.next = currentNode.next;
            currentNode.next.prev = currentNode.prev;
            this.addFirstNode(currentNode);
            return currentNode.value;
        }
        return -1;
    }

    private void addFirstNode(final LRUNode currentNode) {
        currentNode.next = first.next;
        currentNode.prev = first;
        first.next.prev = currentNode;
        first.next = currentNode;
    }

    private void removeLeastUsedNode() {
        LRUNode toRemove = this.last.prev;
        toRemove.prev.next = this.last;
        this.last.prev = toRemove.prev;
        this.cache.remove(toRemove.key);
    }

}

class LRUNode {
    int key;
    int value;
    LRUNode next;
    LRUNode prev;

    public LRUNode(final int key, final int value) {
        this.value = value;
        this.key = key;
    }
}
