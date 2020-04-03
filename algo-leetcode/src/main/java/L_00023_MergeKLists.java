import java.util.*;

/**
 * 题目：
 * 合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
 * 输入:
 * [
 *   1->4->5,
 *   1->3->4,
 *   2->6
 * ]
 * 输出: 1->1->2->3->4->4->5->6
 *
 * @author gaomingjie, jackgo73@outlook.com
 * @see <a href=https://mutex73.github.io/src/main/java/L_00023_MergeKLists.java>SOURCE CODE</a>
 */

public class L_00023_MergeKLists {
    /**
     * 遍历加自助排序，可以关注下List的常规操作技巧
     * 遍历List：以node为判断条件，循环中先用在node=node.next
     * 构造List：head用空节点，for从next开始
     * <p>
     * 复杂度：O(n) + O(logn) + O(n) = O(logn)
     *
     * @param lists 输入List
     * @return 排序合并后List
     */
    public ListNode mergeKLists1(ListNode[] lists) {
        List<Integer> combinedList = new ArrayList<>();
        for (ListNode n : lists) {
            while (n != null) {
                combinedList.add(n.val);
                n = n.next;
            }
            ;
        }

        Collections.sort(combinedList);

        ListNode headNode = new ListNode(0);
        ListNode ptrNode = headNode;
        for (Integer v : combinedList) {
            ptrNode.next = new ListNode(v);
            ptrNode = ptrNode.next;
        }
        return headNode.next;
    }

    /**
     * 优先队列实现，JAVA用数组实现的二叉小顶堆，进出数据都要调整数组顺序，所以都是LogN
     * linked list的每个元素都要进优先队列，所以复杂度是k * LongN
     * <p>
     * 优先队列：https://www.cnblogs.com/CarpenterLee/p/5488070.html
     *
     * @param lists
     * @return
     */
    public ListNode mergeKLists2(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return Integer.compare(o1.val, o2.val);
            }
        });

        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        for (ListNode node : lists) {
            if (node != null) {
                queue.add(node);
            }
        }
        while (!queue.isEmpty()) {
            p.next = queue.poll();
            p = p.next;
            if (p.next != null) {
                queue.add(p.next);
            }
        }
        return dummy.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
