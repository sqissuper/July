/**
 * ClassName:TextDemo4
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Author:HP
 * @date:2021/7/19 22:07
 */
public class TextDemo4 {
    //JZ11 二进制中1的个数
//    public int NumberOf1(int n) {
//        int count = 0;
//        while(n != 0) {
//            count++;
//            n = n & (n - 1);
//        }
//        return count;
//    }

    //JZ13 调整数组顺序使奇数位于偶数前面
//    public int[] reOrderArray (int[] array) {
//        // write code here
//        int[] newArr = new int[array.length];
//        int j = 0;
//        for(int i = 0; i < array.length; i++) {
//            if(array[i] % 2 == 1) {
//                newArr[j++] = array[i];
//            }
//        }
//        for(int i = 0; i < array.length; i++) {
//            if(array[i] % 2 == 0) {
//                newArr[j++] = array[i];
//            }
//        }
//        return newArr;
//    }

    //JZ14 链表中倒数最后k个结点
//    public ListNode FindKthToTail (ListNode pHead, int k) {
//        if(pHead == null) return null;
//        ListNode fast = pHead;
//        int count = 0;
//        ListNode cur = pHead;
//        while(cur != null) {
//            count++;
//            cur = cur.next;
//        }
//        if(count < k) return null;
//        while(k != 0) {
//            fast = fast.next;
//            k--;
//        }
//        ListNode slow = pHead;
//        while(fast != null) {
//            fast = fast.next;
//            slow = slow.next;
//            count++;
//        }
//        return slow;
//    }

    //JZ15 反转链表
//    public ListNode ReverseList(ListNode head) {
//        if(head == null || head.next == null) return head;
//        ListNode cur = head;
//        ListNode prev = null;
//        while(cur != null) {
//            ListNode curNext = cur.next;
//            cur.next = prev;
//            prev = cur;
//            cur = curNext;
//        }
//        head = prev;
//        return head;
//    }
}
