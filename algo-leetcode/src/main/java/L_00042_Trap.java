/**
 * 题目：
 *
 * @author gaomingjie, jackgo73@outlook.com
 * @see <a href=https://github.com/mjoker73/gap/src/main/java/L_00042_Trap.java>SOURCE CODE</a>
 */

public class L_00042_Trap {
    public int trap1(int[] height) {
        int result = 0;
        while (true) {
            int validLevel = 0;
            for (int i = 0; i < height.length; i++) {
                if (height[i] > 0) {
                    validLevel++;
                }
            }
            if (validLevel < 2) {
                break;
            }

            result += calculateOneLevel(height);

            for (int i = 0; i < height.length; i++) {
                height[i] = height[i] == 0 ? 0 : height[i] - 1;
            }

        }
        return result;
    }

    private int calculateOneLevel(int[] curHeight) {
        int result = 0;
        int i = 0, j = curHeight.length - 1;
        while (curHeight[i] == 0 || curHeight[j] == 0) {
            if (curHeight[i] == 0) {
                i++;
            }
            if (curHeight[j] == 0) {
                j--;
            }
        }

        for (int k = i + 1; k < j; k++) {
            if (curHeight[k] == 0) {
                result++;
            }
        }
        return result;
    }

    public int trap2(int[] height) {
        int left = 0;
        int right = height.length -1;
        int ans = 0;
        int left_max = 0, right_max = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= left_max) {
                    left_max = height[left];
                } else {
                    ans += (left_max - height[left]);
                }
                ++left;
            } else {
                if (height[right] >= right_max) {
                    right_max = height[right];
                } else {
                    ans += (right_max - height[right]);
                }
                --right;
            }
        }
        return ans;
    }

    public int trap3(int[] height) {
        if(height == null || height.length == 0) {
            return 0;
        }
        int ans = 0;
        int size = height.length;
        int[] leftMax = new int[size];
        int[] rightMax = new int[size];

        leftMax[0] = height[0];
        for (int i = 1; i < size; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        rightMax[size - 1] = height[size - 1];
        for (int i = size - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        for (int i = 1; i < size - 1; i++) {
            ans += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return ans;
    }
}
