/**
 * 请你设计一个支持下述操作的栈。
 * 实现自定义栈类 CustomStack ：
 *  CustomStack(int maxSize)：用 maxSize 初始化对象，maxSize 是栈中最多能容纳的元素数量，栈在增长到 maxSize 之后则不支持 push 操作。
 *  void push(int x)：如果栈还未增长到 maxSize ，就将 x 添加到栈顶。
 *  int pop()：返回栈顶的值，或栈为空时返回 -1 。
 *  void inc(int k, int val)：栈底的 k 个元素的值都增加 val 。如果栈中元素总数小于 k ，则栈中的所有元素都增加 val 。
 * https://leetcode-cn.com/problems/design-a-stack-with-increment-operation/
 *
 * @author gaomingjie, jackgo73@outlook.com
 * @see <a href="https://mutex73.github.io/src/main/java/me/leetcode/C_05357_CustomStack.java">SOURCE CODE</a>
 */

public class C_180_05357_CustomStack {
    private int maxStackSize = -1;
    int[] stack;
    int stackTopPtr = 0;

    /**
     * 使用异常处理越界问题
     *
     * @param maxSize 栈最大深度
     */
    public C_180_05357_CustomStack(int maxSize) {
        if (maxSize < 0) {
            return;
        }
        maxStackSize = maxSize;
        stack = new int[maxStackSize];
    }

    /**
     * 使用异常捕获实现，熟悉异常处理逻辑，简化代码
     *
     * @param x 压栈值
     */
    public void push(int x) {
        if (maxStackSize == -1) {
            return;
        }
        try {
            stack[stackTopPtr] = x;
        } catch (ArrayIndexOutOfBoundsException e) {
            return;
        }
        stackTopPtr++;
    }

    public int pop() {
        if (maxStackSize == -1) {
            return 0;
        }
        int val;
        try {
            val = stack[stackTopPtr - 1];
            stackTopPtr--;
        } catch (ArrayIndexOutOfBoundsException e) {
            val = -1;
        }
        return val;
    }

    public void increment(int k, int val) {
        if (maxStackSize == -1 || k <= 0) {
            return;
        }
        int l = Math.min(k, maxStackSize);
        for (int i = 0; i < l; i++) {
            stack[i] += val;
        }
    }
}
