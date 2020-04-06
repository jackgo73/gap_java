import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class C_05362_CanConstructTest {
    C_05362_CanConstruct c_05362 = new C_05362_CanConstruct();
    @Test
    public void testCase1() {
        assertEquals(c_05362.canConstruct("annabelle", 2), true);
        assertEquals(c_05362.canConstruct("leetcode", 3), false);
        assertEquals(c_05362.canConstruct("true", 4), true);
        assertEquals(c_05362.canConstruct("yzyzyzyzyzyzyzy", 2), true);
        assertEquals(c_05362.canConstruct("cr", 7), false);
    }

    @Test
    public void testCase2() {
        assertEquals(c_05362.canConstruct("aaa", 2), true);

    }
}
