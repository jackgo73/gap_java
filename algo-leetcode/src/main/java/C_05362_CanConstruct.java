import java.util.HashMap;
import java.util.Map;

/**
 * 题目：给你一个字符串 s 和一个整数 k 。请你用 s 字符串中 所有字符 构造 k 个非空 回文串 。
 *
 * 如果你可以用 s 中所有字符构造 k 个回文字符串，那么请你返回 True ，否则返回 False 。
 * <p>
 * 笔记：
 * 1、偶数可以和任意偶数组合
 * 2、偶数可以和一个奇数组合
 * 3、在min和max范围内的所有组合都是可以出来的
 *
 * min是奇数的个数
 * max是所有出现次数的总数
 *
 * @author gaomingjie, jackgo73@outlook.com
 * @see <a href=https://github.com/mjoker73/gap/src/main/java/L_05362_CanConstruct.java>SOURCE CODE</a>
 */

public class C_05362_CanConstruct {

    public boolean canConstruct(String s, int k) {
        int max = 0;
        int min = 0;
        int odd = 0, even = 0;

        Map<Character, Integer> map = new HashMap<>();
        for (Character c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (Map.Entry entry : map.entrySet()) {
            Integer n = (Integer) entry.getValue();
            if (n % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            max += n;
        }

        min = odd;

        if (k >= min && k <= max) {
            return true;
        } else {
            return false;
        }
    }
}
