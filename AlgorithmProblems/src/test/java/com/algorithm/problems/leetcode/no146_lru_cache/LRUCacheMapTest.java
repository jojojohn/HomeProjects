package com.algorithm.problems.leetcode.no146_lru_cache;

import junit.framework.TestCase;
import org.junit.Test;

public class LRUCacheMapTest extends TestCase {

    @Test(expected = Exception.class)
    public void testLru() {
        LRUCacheMap lruCache = new LRUCacheMap(2);
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        assertEquals(lruCache.get(1), 1);
        lruCache.put(3, 3);
        assertEquals(lruCache.get(2), -1);
        lruCache.put(4, 4);
        assertEquals(lruCache.get(1), -1);
        assertEquals(lruCache.get(3), 3);
        assertEquals(lruCache.get(4), 4);

    }
}