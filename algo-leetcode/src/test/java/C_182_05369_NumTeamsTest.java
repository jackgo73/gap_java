import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class C_182_05369_NumTeamsTest {
    C_182_05369_NumTeams c_05369 = new C_182_05369_NumTeams();

    @Test
    public void testCase1() {
        int[] r = {2, 5, 3, 4, 1};
        assertEquals(c_05369.numTeams(r), 3);
    }

    @Test
    public void testCase2() {
        int[] r = {2,1,3};
        assertEquals(c_05369.numTeams(r), 0);
    }

    @Test
    public void testCase3() {
        int[] r = {1,2,3,4};
        assertEquals(c_05369.numTeams(r), 4);
    }

}
