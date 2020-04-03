import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class C_180_05356_LuckyNumbersTest {
    C_180_05356_LuckyNumbers c_05356 = new C_180_05356_LuckyNumbers();
    @Test
    public void testCast01() {
        int [][] dat=new int[][]{{3,7,8},{9,11,13},{15,16,17}};
        List<Integer> res = Arrays.asList(15);
        assertEquals(res, c_05356.luckyNumbers(dat));
    }
}
