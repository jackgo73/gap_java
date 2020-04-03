import java.util.Arrays;

/**
 * 题目：最大间距
 * 给定一个未经排序的数组，请找出其排序表中连续两个要素的最大间距。
 * 如果数组中的要素少于 2 个，请返回 0.
 * 注意事项：
 * 可以假定数组中的所有要素都是非负整数，且最大不超过 32 位整数。
 * 样例：
 * 给定数组 [1, 9, 2, 5]，其排序表为 [1, 2, 5, 9]，其最大的
 * 间距是在 5 和 9 之间，= 4.
 *
 * @author gaomingjie, jackgo73@outlook.com
 * @see <a href="https://mutex73.github.io/src/main/java/me/leetcode/L_0176_MaximumGap.java">SOURCE CODE</a>
 */

public class L_00176_MaximumGap {

    /**
     * 解法1
     *
     * 排序再遍历
     *
     * 复杂度：排序nlogn + 遍历n = nlogn
     *
     * @param numbers: 输入数组
     * @return : 最大间距
     */
    public int maxGap1(int[] numbers) {
        if ((numbers == null) || (numbers.length < 2)) {
            return 0;
        }
        //nlogn
        Arrays.sort(numbers);
        int maxGap = 0;
        for (int i = 1; i < numbers.length; i++) {
            maxGap = Math.max(maxGap, numbers[i] - numbers[i - 1]);
        }
        return maxGap;
    }


    /**
     * 解法2
     *
     * 对这些数平均分桶，如果是闭区间，桶数=数组个数
     * 桶内左闭右开，最后一个数会单独一桶，桶数=数组个数+1
     * 数组个数比桶数大会有空桶，保证maxgap在桶间
     *
     * 复杂度：遍历拆桶n + 遍历桶距n = n
     *
     * @param numbers: 输入数组
     * @return : 最大间距
     */
    public int maxGap2(int[] numbers) {
        if ((numbers == null) || (numbers.length < 2)) {
            return 0;
        }

        int len = numbers.length;
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }
        if (max == min) {
            return 0;
        }

        // 左闭右开的桶，所以最后一个数要多一个桶
        int bucketCnt = len + 1;
        // 数组只保存最大最小值[(min,max),(min,max),...,(min,max)]
        int[][] buckets = new int[bucketCnt][2];
        for (int i = 0; i < len; i++) {
            int num = numbers[i];
            // 一次计算避免取整误差，桶号=当前值相对min的偏移*桶宽
            int idx = (int) ((num - min) * (long) len / (max - min));
            if (buckets[idx][0] == 0) {
                buckets[idx] = new int[]{num, num};
            } else {
                buckets[idx][0] = Math.min(buckets[idx][0], num);
                buckets[idx][1] = Math.max(buckets[idx][1], num);
            }
        }
        //遍历桶间找到最大gap
        int maxGap = 0;
        int[] prevBucketElem = buckets[0];
        for (int i = 1; i < bucketCnt; i++) {
            int[] bucketElem = buckets[i];
            if (bucketElem[0] == 0 && bucketElem[1] == 0) {
                continue;
            }
            maxGap = Math.max(maxGap, bucketElem[0] - prevBucketElem[1]);
            prevBucketElem = bucketElem;
        }
        return maxGap;
    }

}
