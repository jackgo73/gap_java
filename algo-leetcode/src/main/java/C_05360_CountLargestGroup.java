import java.util.HashMap;
import java.util.Map;

/**
 * 题目：给你一个整数 n 。请你先求出从 1 到 n 的每个整数 10 进制表示下的数位和（每一位上的数字相加），然后把数位和相等的数字放到同一个组中。
 *
 * 请你统计每个组中的数字数目，并返回数字数目并列最多的组有多少个。
 *
 * @author gaomingjie, jackgo73@outlook.com
 * @see <a href=https://github.com/mjoker73/gap/src/main/java/L_05360_CountLargestGroup.java>SOURCE CODE</a>
 */

public class C_05360_CountLargestGroup {
    public int countLargestGroup(int n) {
        int max = 1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            int sum = 0 ;
            int num = i;
            while (num != 0) {
                sum += num % 10 ;
                num /= 10 ;
            }
            if (map.containsKey(sum)) {
                int v = map.get(sum);
                map.put(sum, v + 1);
                max = Math.max(v+1,max);
            } else {
                map.put(sum, 1);
            }
        }

        int result = 0;
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue() == max) {
                result++;
            }
        }

        return result;
    }
}
