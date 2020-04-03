import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class C_182_05368_FindLuckyTest {
    C_182_05368_FindLucky c_05368 = new C_182_05368_FindLucky();
    @Test
    public void testCase1() {
        int[] arr1 = {2,2,3,4};
        assertEquals(c_05368.findLucky(arr1), 2);
    }

    @Test
    public void testCase2() {
        int[] arr1 = {1,2,2,3,3,3};
        assertEquals(c_05368.findLucky(arr1), 3);
    }

    @Test
    public void testCase3() {
        int[] arr1 = {2,2,2,3,3};
        assertEquals(c_05368.findLucky(arr1), -1);
    }

    @Test
    public void testCase4() {
        int[] arr1 = {5};
        assertEquals(c_05368.findLucky(arr1), -1);
    }@Test

    public void testCase5() {
        int[] arr1 = {7,7,7,7,7,7,7};
        assertEquals(c_05368.findLucky(arr1), 7);
    }
}
