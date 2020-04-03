
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class L_00023_MergeKListsTest {
    L_00023_MergeKLists l_00023 = new L_00023_MergeKLists();
    @Test
    public void testCase01() {
        L_00023_MergeKLists.ListNode[] data = new L_00023_MergeKLists.ListNode[] {
                new L_00023_MergeKLists.ListNode(1),
                new L_00023_MergeKLists.ListNode(1),
                new L_00023_MergeKLists.ListNode(2)
        };
        data[0].next = new L_00023_MergeKLists.ListNode(4);
        data[0].next.next = new L_00023_MergeKLists.ListNode(5);
        data[1].next = new L_00023_MergeKLists.ListNode(3);
        data[1].next.next = new L_00023_MergeKLists.ListNode(4);
        data[2].next = new L_00023_MergeKLists.ListNode(6);

        L_00023_MergeKLists.ListNode res = new L_00023_MergeKLists.ListNode(1);
        res.next = new L_00023_MergeKLists.ListNode(1);
        res.next.next = new L_00023_MergeKLists.ListNode(2);
        res.next.next.next = new L_00023_MergeKLists.ListNode(3);
        res.next.next.next.next = new L_00023_MergeKLists.ListNode(4);
        res.next.next.next.next.next = new L_00023_MergeKLists.ListNode(4);
        res.next.next.next.next.next.next = new L_00023_MergeKLists.ListNode(5);
        res.next.next.next.next.next.next.next = new L_00023_MergeKLists.ListNode(6);

        L_00023_MergeKLists.ListNode out = l_00023.mergeKLists1(data);
        while (res != null && out != null) {
            assertEquals(res.val, out.val);
            res = res.next;
            out = out.next;
        }

        L_00023_MergeKLists.ListNode out2 = l_00023.mergeKLists2(data);
        while (res != null && out2 != null) {
            assertEquals(res.val, out2.val);
            res = res.next;
            out2 = out2.next;
        }

    }
}
