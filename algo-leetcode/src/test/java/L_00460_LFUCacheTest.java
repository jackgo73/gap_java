import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class L_00460_LFUCacheTest {
    L_00460_LFUCache cache = new L_00460_LFUCache(2);

    @Test
    public void testCase1() {
        cache.put(1, 1);
        cache.put(2, 2);
        assertEquals(cache.get(1), 1);        // 返回 1
        cache.put(3, 3);                             // 去除 key 2
        assertEquals(cache.get(2), -1);       // 返回 -1 (未找到key 2)
        cache.get(3);                                // 返回 3
        cache.put(4, 4);                             // 去除 key 1
        cache.get(1);                                // 返回 -1 (未找到 key 1)
        cache.get(3);                                // 返回 3
        assertEquals(cache.get(4), 4);        // 返回 4
    }
}
