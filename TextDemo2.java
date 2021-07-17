/**
 * ClassName:TextDemo2
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Author:HP
 * @date:2021/7/17 22:10
 */
public class TextDemo2 {
    //JZ1 二维数组中的查找
//    public boolean Find(int target, int [][] array) {
//        for(int i= 0; i < array.length; i++) {
//            for(int j = 0; j < array[0].length; j++) {
//                if(array[i][j] == target) return true;
//            }
//        }
//        return false;
//    }
//    public boolean Find(int target, int [][] array) {
//        for(int i= 0; i < array.length; i++) {
//            int left = 0,right = array[0].length - 1;
//            while(left <= right) {
//                int mid = (left + right) / 2;
//                if(array[i][mid] > target) {
//                    right = mid - 1;
//                } else if(array[i][mid] < target) {
//                    left = mid + 1;
//                } else {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    //JZ3 从尾到头打印链表
//    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//        ArrayList<Integer> list = new ArrayList<>();
//        if(listNode == null) return list;
//        ListNode cur = listNode;
//        while(cur != null) {
//            list.add(0,cur.val);
//            cur = cur.next;
//        }
//        return list;
//    }

    //JZ4 重建二叉树
//    public int index = 0;
//    public TreeNode buildTree(int[] pre,int[] in,int s,int e) {
//        if(s > e) return null;
//        TreeNode root = new TreeNode(pre[index]);
//        int idx = findTravle(in,s,e,pre[index]);
//        index++;
//        root.left = buildTree(pre,in,s,idx - 1);
//        root.right = buildTree(pre,in,idx + 1,e);
//        return root;
//    }
//    public int findTravle(int[] in,int s,int e,int key) {
//        for(int i = s;i <= e; i++) {
//            if(in[i] == key) return i;
//        }
//        return -1;
//    }
//    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
//        if(pre.length == 0 || in.length == 0) return null;
//        int s = 0,e = pre.length - 1;
//        return buildTree(pre,in,s,e);
//    }
}
