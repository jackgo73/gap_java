import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L_00053_MaxSubArrayTest {
    L_00053_MaxSubArray l_00053 = new L_00053_MaxSubArray();

    @Test
    public void testCase1() {
        int[] t1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(l_00053.maxSubArray(t1), 6);

    }
}
