package com.algorithm.problems.leetcode.no146_lru_cache;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCache {

    private Map<Integer, Integer> lruCache;
    private int capacity;
    private int currentSize;
    private LinkedList<Integer> queue;

    public LRUCache(final int capacity) {
        this.lruCache = new HashMap<>();
        this.capacity = capacity;
        this.queue = new LinkedList<Integer>();
    }

    public int get(final int key) {
        if(lruCache.containsKey(key)) {
            this.queue.addFirst(queue.remove(queue.indexOf(key)));
            return this.lruCache.get(key);
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if(!lruCache.containsKey(key)) {
            if (this.currentSize == this.capacity) {
                this.lruCache.remove(queue.removeLast());
                this.currentSize--;
            }
            this.lruCache.put(key, value);
            this.queue.addFirst(key);
            this.currentSize++;
        } else {
            this.lruCache.put(key, value);
            this.queue.remove(queue.indexOf(key));
            this.queue.addFirst(key);
        }
    }
}
