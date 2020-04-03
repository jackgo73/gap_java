import java.util.HashMap;
import java.util.Map;

/**
 * 在整数数组中，如果一个整数的出现频次和它的数值大小相等，我们就称这个整数为「幸运数」。
 * <p>
 * 给你一个整数数组 arr，请你从中找出并返回一个幸运数。
 * <p>
 * 如果数组中存在多个幸运数，只需返回 最大 的那个。
 * 如果数组中不含幸运数，则返回 -1 。
 */

public class C_182_05368_FindLucky {
    public int findLucky(int[] arr) {
        if (arr == null) {
            return -1;
        }
        int luckey = -1;
        boolean flag = false;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int k : arr) {
            if (map.containsKey(k)) {
                Integer v = map.get(k) + 1;
                map.put(k, v);
            } else {
                map.put(k, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(entry.getKey())) {
                flag = true;
                luckey = Math.max(luckey, entry.getKey());
            }
        }
        if (!flag) {
            return -1;
        } else {
            return luckey;
        }
    }
}
