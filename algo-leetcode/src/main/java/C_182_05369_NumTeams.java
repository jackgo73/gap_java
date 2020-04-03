/**
 * n 名士兵站成一排。每个士兵都有一个 独一无二 的评分 rating 。
 * <p>
 * 每 3 个士兵可以组成一个作战单位，分组规则如下：
 * <p>
 * 从队伍中选出下标分别为 i、j、k 的 3 名士兵，他们的评分分别为
 * rating[i]、rating[j]、rating[k]
 * 作战单位需满足：
 * rating[i] < rating[j] < rating[k]
 * 或者 rating[i] > rating[j] > rating[k] ，
 * 其中  0 <= i < j < k < n
 * 请你返回按上述条件可以组建的作战单位数量。每个士兵都可以是多个作战单位的一部分。
 */


public class C_182_05369_NumTeams {
    public int numTeams(int[] rating) {
        int unitCnt = 0;
        int[] r = rating;

        for (int i = 0; i < rating.length - 2; i++) {
            for (int j = i; j < rating.length - 2; j++) {
                for (int k = j; k < rating.length - 2; k++) {
                    if (r[i] > r[j + 1] && r[j + 1] > r[k + 2]) {
                        unitCnt++;
                    }
                    if (r[i] < r[j + 1] && r[j + 1] < r[k + 2]) {
                        unitCnt++;
                    }
                }
            }
        }
        return unitCnt;
    }
}
