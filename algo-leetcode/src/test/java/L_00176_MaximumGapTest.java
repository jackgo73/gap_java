import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class L_00176_MaximumGapTest {
    L_00176_MaximumGap l_00176 = new L_00176_MaximumGap();

    @Test
    public void testNull() {
        assertEquals(0, l_00176.maxGap1(null));
        assertEquals(0, l_00176.maxGap2(null));
    }


    @Test
    public void testShortData1() {

        assertEquals(4, l_00176.maxGap1(new int[]{1, 9, 2, 5}));
        assertEquals(4, l_00176.maxGap2(new int[]{1, 9, 2, 5}));
    }

    @Test
    public void testShortData2() {
        assertEquals(3, l_00176.maxGap1(new int[]{1, 3, 6, 8, 9}));
        assertEquals(3, l_00176.maxGap2(new int[]{1, 3, 6, 8, 9}));
    }

    @Test
    public void testShortData3() {

        assertEquals(190, l_00176.maxGap1(new int[]{350, 10, 0, 200}));
        assertEquals(190, l_00176.maxGap2(new int[]{350, 10, 0, 200}));
    }

    @Test
    public void testShortData4() {

        assertEquals(123122, l_00176.maxGap1(new int[]{1, 123123}));
        assertEquals(123122, l_00176.maxGap2(new int[]{1, 123123}));
    }

    @Test
    public void testShortData5() {

        assertEquals(1, l_00176.maxGap1(new int[]{0, 0, 0, 0, 1, 2, 2, 2, 2, 2}));
        assertEquals(1, l_00176.maxGap2(new int[]{0, 0, 0, 0, 1, 2, 2, 2, 2, 2}));
    }

    @Test
    public void testShortData6() {

        assertEquals(4, l_00176.maxGap1(new int[]{1, 5, 6, 7, 11}));
        assertEquals(4, l_00176.maxGap2(new int[]{1, 5, 6, 7, 11}));
    }

    @Test
    public void testLargeData1() {
        assertEquals(28088900, l_00176.maxGap1(new int[]{32413455, 1123535, 4324555}));
        assertEquals(28088900, l_00176.maxGap2(new int[]{32413455, 1123535, 4324555}));
    }
}
