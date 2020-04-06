import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class C_05361_CheckOverlapTest {
    C_05361_CheckOverlap c_05361 = new C_05361_CheckOverlap();

    @Test
    public void testCase1() {
        assertTrue(c_05361.checkOverlap(1, 1, 1, -3, -3, 3, 3));
    }
}
