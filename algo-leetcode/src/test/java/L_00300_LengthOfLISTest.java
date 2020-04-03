import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L_00300_LengthOfLISTest {
    L_00300_LengthOfLIS l_00300 = new L_00300_LengthOfLIS();

    @Test
    public void testCase01() {
        int[] nums01 = {10, 9, 2, 5, 3, 7, 101, 18};
        assertEquals(4, l_00300.lengthOfLIS(nums01));

    }

    @Test
    public void testCase02() {
        int[] nums02 = {10,9,2,5,3,4};
        assertEquals(3, l_00300.lengthOfLIS(nums02));

    }
}
