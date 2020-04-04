import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class L_00003_LengthOfLongestSubstringTest {
    L_00003_LengthOfLongestSubstring l_00003 = new L_00003_LengthOfLongestSubstring();
    @Test
    public void testCase1() {
        assertEquals(l_00003.lengthOfLongestSubstring1("abcabcbb"), 3);
        assertEquals(l_00003.lengthOfLongestSubstring1("bbbbb"), 1);
        assertEquals(l_00003.lengthOfLongestSubstring1("pwwkew"), 3);
    }
    @Test
    public void testCase2() {
        assertEquals(l_00003.lengthOfLongestSubstring2("abcabcbb"), 3);
        assertEquals(l_00003.lengthOfLongestSubstring2("bbbbb"), 1);
        assertEquals(l_00003.lengthOfLongestSubstring2("pwwkew"), 3);
    }

    @Test
    public void testCase3() {
        assertEquals(l_00003.lengthOfLongestSubstring3("abcabcbb"), 3);
        assertEquals(l_00003.lengthOfLongestSubstring3("bbbbb"), 1);
        assertEquals(l_00003.lengthOfLongestSubstring3("pwwkew"), 3);
        assertEquals(l_00003.lengthOfLongestSubstring3("abba"), 2);
    }
}
