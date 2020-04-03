public class L_00300_LengthOfLIS {

    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            int curLen = 0;
            int curNum = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (curNum < nums[j]) {
                    curNum =  nums[j];
                    curLen++;
                }
            }
            maxLen = Math.max(maxLen, curLen);
        }
        return maxLen + 1;
    }
}
