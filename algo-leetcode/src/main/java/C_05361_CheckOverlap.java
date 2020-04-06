/**
 * 题目：2)，其中 (x1, y1) 是矩形左下角的坐标，(x2, y2) 是右上角的坐标。
 *
 * 如果圆和矩形有重叠的部分，请你返回 True ，否则返回 False 。
 *
 * 换句话说，请你检测是否 存在 点 (xi, yi) ，它既在圆上也在矩形上（两者都包括点落在边界上的情况）。
 *
 * @author gaomingjie, jackgo73@outlook.com
 * @see <a href=https://github.com/mjoker73/gap/src/main/java/L_05361_CheckOverlap.java>SOURCE CODE</a>
 */

public class C_05361_CheckOverlap {
    public boolean checkOverlap(int radius, int x_center, int y_center, int x1, int y1, int x2, int y2) {
        if (x_center - radius > x2 || x_center + radius < x1 || y_center - radius > y2 || y_center + radius < y1) {
            return false;
        }
        x1 = Math.max(x1, x_center - radius);
        x2 = Math.min(x2, x_center + radius);
        y1 = Math.max(y1, y_center - radius);
        y2 = Math.min(y2, y_center + radius);
        int i, j;
        for (i = x1; i <= x2; i++) {
            for (j = y1; j <= y2; j++) {
                if ((i - x_center) * (i - x_center) + (j - y_center) * (j - y_center) <= radius * radius) {
                    return true;
                }
            }
        }
        return false;
    }
}
