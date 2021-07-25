import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * ClassName:TextDemo8
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Author:HP
 * @date:2021/7/24 22:25
 */
public class TextDemo8 {
    //JZ28 数组中出现次数超过一半的数字
//    public int MoreThanHalfNum_Solution(int [] array) {
//        Arrays.sort(array);
//        return array[array.length / 2];
//    }

    //JZ29 最小的K个数
//    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
//        ArrayList<Integer> list = new ArrayList<>();
//        Arrays.sort(input);
//        for(int i = 0; i < k; i++) {
//            list.add(input[i]);
//        }
//        return list;
//    }


    //JZ30 连续子数组的最大和
//    public int FindGreatestSumOfSubArray(int[] array) {
//        if(array == null || array.length == 0) return 0;
//        int[] dp = new int[array.length];
//        dp[0] = array[0];
//        int max = array[0];
//        for(int i = 1; i < array.length; i++) {
//            dp[i] = Math.max(dp[i - 1] + array[i],array[i]);
//            max = Math.max(dp[i],max);
//        }
//        return max;
//    }

    //JZ34 第一个只出现一次的字符
//    public int FirstNotRepeatingChar(String str) {
//        if(str == null || str.length() == 0) return 0;
//        HashMap<Character,Integer> map = new HashMap<>();
//        for(int i = 0; i < str.length(); i++) {
//            if(map.containsKey(str.charAt(i))) {
//                int tmp = map.get(str.charAt(i));
//                map.put(str.charAt(i),tmp + 1);
//            } else {
//                map.put(str.charAt(i),1);
//            }
//        }
//        for(int i = 0; i < str.length(); i++) {
//            if(map.get(str.charAt(i)) == 1) return i;
//        }
//        return -1;
//    }

    //JZ36 两个链表的第一个公共结点
//    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
//        if(pHead1 == null || pHead2 == null) return null;
//        ListNode p1 = pHead1,p2 = pHead2;
//        int len1 = 0, len2 = 0;
//        while(p1 != null) {
//            len1++;
//            p1 = p1.next;
//        }
//        while(p2 != null) {
//            len2++;
//            p2 = p2.next;
//        }
//        int len = len1 - len2;
//        p1 = pHead1;
//        p2 = pHead2;
//        if(len < 0) {
//            len = len2 - len1;
//            p1 = pHead2;
//            p2 = pHead1;
//        }
//        while(len != 0) {
//            p1 = p1.next;
//            len--;
//        }
//        while(p1 != p2) {
//            p1 = p1.next;
//            p2 = p2.next;
//        }
//        return p1;
//    }
    public static void main(String[] args) {

    }
}
