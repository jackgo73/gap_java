import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个 m * n 的矩阵，矩阵中的数字 各不相同 。请你按 任意 顺序返回矩阵中的所有幸运数。
 *
 * 幸运数是指矩阵中满足同时下列两个条件的元素：
 *
 * 在同一行的所有元素中最小
 * 在同一列的所有元素中最大
 * https://leetcode-cn.com/problems/lucky-numbers-in-a-matrix/
 *
 * @author gaomingjie, jackgo73@outlook.com
 * @see <a href="https://mutex73.github.io/src/main/java/me/leetcode/C_05356_LuckyNumbers.java">SOURCE CODE</a>
 */
public class C_180_05356_LuckyNumbers {
    /**
     * 解法比较原始，遍历行找到最小值，再遍历列是不是最大值
     *
     * @param matrix 输入二维数组
     * @return 行最小列最大的值
     */
    public List<Integer> luckyNumbers(int[][] matrix) {
        if (matrix == null) {
            return null;
        }
        int M = matrix.length;
        int N = matrix[0].length;
        List<Integer> res = new ArrayList<Integer>();

        boolean found = false;
        int rmin;
        int rminColNo = 0;
        for (int i = 0; i < M; i++) {
            rmin = matrix[i][0];
            // find max in row, rminColNo is col number of max
            for (int j = 0; j < N; j++) {
                if (rmin > matrix[i][j]) {
                    rmin = matrix[i][j];
                    rminColNo = j;
                }
            }
            found = true;
            for (int k = 0; k < M; k++) {
                if (k != i && rmin < matrix[k][rminColNo]) {
                    found = false;
                    break;
                }
            }
            if (found) {
                res.add(rmin);
            }
        }
        return res;
    }
}
