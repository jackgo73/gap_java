import org.junit.Test;

import java.io.IOException;

import static junit.framework.TestCase.assertEquals;

public class L_00042_TrapTest {
    L_00042_Trap l_00042 = new L_00042_Trap();

    /**
     *
     */
    @Test
    public void testCase1() {
        assertEquals(l_00042.trap3(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}), 6);
        assertEquals(l_00042.trap2(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}), 6);
        assertEquals(l_00042.trap1(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}), 6);
    }

    /**
     * 3330ms
     */
    @Test
    public void testCase2() throws IOException {
        String path = this.getClass().getResource("L_00042_TrapTest_TestCase2").getFile();
        int[] data = T_FileLoader.loadCommaSepArrayToInts(path);
        assertEquals(l_00042.trap1(data), 174801674);
    }

    /**
     * 135ms
     */
    @Test
    public void testCase3() throws IOException {
        String path = this.getClass().getResource("L_00042_TrapTest_TestCase2").getFile();
        int[] data = T_FileLoader.loadCommaSepArrayToInts(path);
        assertEquals(l_00042.trap2(data), 174801674);
    }

    /**
     * 185ms
     */
    @Test
    public void testCase4() throws IOException {
        String path = this.getClass().getResource("L_00042_TrapTest_TestCase2").getFile();
        int[] data = T_FileLoader.loadCommaSepArrayToInts(path);
        assertEquals(l_00042.trap3(data), 174801674);
    }
}
