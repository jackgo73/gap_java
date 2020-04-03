import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class L_00008_MyAtoiTest {
    L_00008_MyAtoi l_00008 = new L_00008_MyAtoi();
    @Test
    public void testCase1() {
        assertEquals(l_00008.myAtoi("-42"), -42);
    }
    @Test
    public void testCase2() {
        assertEquals(l_00008.myAtoi("   -42"), -42);
    }
    @Test
    public void testCase3() {
        assertEquals(l_00008.myAtoi("words and 987"), 0);
    }
    @Test
    public void testCase4() {
        assertEquals(l_00008.myAtoi("-91283472332"), Integer.MIN_VALUE);
    }

    @Test
    public void testCase5() {
        assertEquals(l_00008.myAtoi("9128347233999"), Integer.MAX_VALUE);
    }

    @Test
    public void testCase6() {
        assertEquals(l_00008.myAtoi("4193 with words"), 4193);
    }
}
