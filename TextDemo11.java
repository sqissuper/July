import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:TextDemo11
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Author:HP
 * @date:2021/7/27 19:28
 */
public class TextDemo11 {
    //JZ46 孩子们的游戏(圆圈中最后剩下的数)
//    public int LastRemaining_Solution(int n, int m) {
//        if(n == 0 || m == 0) return -1;
//        List<Integer> list = new ArrayList<>();
//        for(int i = 0; i < n; i++) {
//            list.add(i);
//        }
//        int index = 0;
//        while(list.size() > 1) {
//            index = (m - 1 + index) % list.size();
//            list.remove(index);
//        }
//        return list.get(0);
//    }


    //JZ49 把字符串转换成整数
//    public int StrToInt(String str) {
//        if(str == null || str.length() == 0) return 0;
//        str = str.trim();
//        int f = 1;
//        int index = 0;
//        if(str.charAt(0) == '+') index++;
//        if(str.charAt(0) == '-') {
//            f = -1;
//            index++;
//        }
//        int sum = 0;
//        for(int i = index; i < str.length(); i++) {
//            if(str.charAt(i) - '0' < 0 || str.charAt(i) - '0' > 9) return 0;
//            sum = sum * 10 + str.charAt(i) - '0';
//        }
//        return f * sum;
//    }

    //JZ55 链表中环的入口结点
//    public ListNode EntryNodeOfLoop(ListNode pHead) {
//        if(pHead == null || pHead.next == null) return null;
//        ListNode fast = pHead;
//        ListNode slow = pHead;
//        while(fast != null && fast.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//            if(fast == slow) break;
//        }
//        slow = pHead;
//        if(fast == null || fast.next == null) return null;
//        while(slow != fast) {
//            fast  =fast.next;
//            slow = slow.next;
//        }
//        return slow;
//    }

    //JZ56 删除链表中重复的结点
//    public ListNode deleteDuplication(ListNode pHead) {
//        if(pHead == null || pHead.next == null) return pHead;
//        ListNode newHead = new ListNode(-1);
//        ListNode cur = pHead;
//        ListNode prev = newHead;
//        while(cur != null) {
//            if(cur.next != null && cur.val == cur.next.val) {
//                while(cur.next != null && cur.val == cur.next.val) {
//                    cur = cur.next;
//                }
//                cur = cur.next;
//            } else {
//                prev.next = cur;
//                cur = cur.next;
//                prev = prev.next;
//            }
//            prev.next = null;
//        }
//        return newHead.next;
//    }

    //JZ57 二叉树的下一个结点
//    public TreeLinkNode GetNext(TreeLinkNode pNode) {
//        if(pNode == null) return null;
//        if(pNode.right != null) {
//            pNode = pNode.right;
//            while(pNode.left != null) pNode = pNode.left;
//            return pNode;
//        }
//        while(pNode.next != null) {
//            if(pNode.next.left == pNode) return pNode.next;
//            pNode = pNode.next;
//        }
//        return null;
//    }
    public static void main(String[] args) {
//        int n = 5,m = 3;
//        LastRemaining_Solution(n,m);
    }
}
