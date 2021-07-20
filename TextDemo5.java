/**
 * ClassName:TextDemo5
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Author:HP
 * @date:2021/7/19 23:02
 */
public class TextDemo5 {

    //JZ16 合并两个排序的链表
//    public ListNode Merge(ListNode list1,ListNode list2) {
//        ListNode node = new ListNode(0);
//        if(list1 == null && list2 == null) return null;
//        if(list1 == null) return list2;
//        if(list2 == null) return list1;
//        ListNode prev = node;
//        ListNode l1 = list1;
//        ListNode l2 = list2;
//        while(l1 != null && l2 != null) {
//            if(l1.val < l2.val) {
//                prev.next = l1;
//                l1 = l1.next;
//            } else {
//                prev.next = l2;
//                l2 = l2.next;
//            }
//            prev = prev.next;
//        }
//        if(l1 != null) prev.next = l1;
//        if(l2 != null) prev.next = l2;
//        return node.next;
//    }

    //JZ17 树的子结构
//    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
//        if(root2 == null || root1 == null) return false;
//        if(isSameTree(root1,root2)) return true;
//        if(HasSubtree(root1.left,root2)) return true;
//        if(HasSubtree(root1.right,root2)) return true;
//        return false;
//    }
//    public boolean isSameTree(TreeNode p, TreeNode q) {
//        if(q == null) return true;
//        if(p == null) return false;
//        if(p.val != q.val) return false;
//        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
//    }

    //JZ18 二叉树的镜像
//    public TreeNode Mirror (TreeNode pRoot) {
//        if(pRoot == null) return null;
//        if(pRoot.left == null && pRoot.right == null) return pRoot;
//        TreeNode tmp = pRoot.left;
//        pRoot.left = pRoot.right;
//        pRoot.right = tmp;
//        Mirror(pRoot.left);
//        Mirror(pRoot.right);
//        return pRoot;
//    }
    public static void main(String[] args) {

    }
}
