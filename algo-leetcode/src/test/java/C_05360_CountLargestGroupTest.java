import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class C_05360_CountLargestGroupTest {
    C_05360_CountLargestGroup c_05360 = new C_05360_CountLargestGroup();
    @Test
    public void testCase1() {
        assertEquals(c_05360.countLargestGroup(13), 4);
        assertEquals(c_05360.countLargestGroup(2), 2);
        assertEquals(c_05360.countLargestGroup(15), 6);
        assertEquals(c_05360.countLargestGroup(24), 5);
    }
}
