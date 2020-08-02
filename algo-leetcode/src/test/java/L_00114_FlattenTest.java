import org.junit.Test;

public class L_00114_FlattenTest {
    L_00114_Flatten l_00114 = new L_00114_Flatten();

    @Test
    public void testCase1() {
        L_00114_Flatten.TreeNode root = new L_00114_Flatten.TreeNode(1);
        root.left = new L_00114_Flatten.TreeNode(2);
        root.right = new L_00114_Flatten.TreeNode(5);
        root.left.left = new L_00114_Flatten.TreeNode(3);
        root.left.right = new L_00114_Flatten.TreeNode(4);
        root.right.right = new L_00114_Flatten.TreeNode(6);

        l_00114.flatten(root);

    }
}
