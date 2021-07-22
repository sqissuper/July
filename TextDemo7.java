/**
 * ClassName:TextDemo7
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Author:HP
 * @date:2021/7/22 21:15
 */
public class TextDemo7 {

    //复杂链表的复制
//    public RandomListNode Clone(RandomListNode pHead) {
//        if(pHead == null) return null;
//        HashMap<RandomListNode,RandomListNode> map = new HashMap<>();
//        RandomListNode cur = pHead;
//        while(cur != null) {
//            RandomListNode node = new RandomListNode(cur.label);
//            map.put(cur,node);
//            cur = cur.next;
//        }
//        cur = pHead;
//        while(cur != null) {
//            map.get(cur).next = map.get(cur.next);
//            map.get(cur).random = map.get(cur.random);
//            cur = cur.next;
//        }
//        return map.get(pHead);
//    }

    //JZ26 二叉搜索树与双向链表
//    public TreeNode prev = null;
//    public void convertChild(TreeNode tree) {
//        if(tree == null) return;
//        convertChild(tree.left);
//        tree.left = prev;
//        if(prev != null) {
//            prev.right = tree;
//        }
//        prev = tree;
//        convertChild(tree.right);
//    }
//    public TreeNode Convert(TreeNode pRootOfTree) {
//        if(pRootOfTree == null) return null;
//        convertChild(pRootOfTree);
//        TreeNode head = pRootOfTree;
//        while(head.left != null) head = head.left;
//        return head;
//    }

    //JZ27 字符串的排列
//    public ArrayList<String> list = new ArrayList<>();
//    public ArrayList<String> Permutation(String str) {
//        char[] ch = str.toCharArray();
//        dfs(ch,0);
//        Collections.sort(list);
//        return list;
//    }
//    public void dfs(char[] c,int idx) {
//        if(idx == c.length - 1) {
//            if(!list.contains(new String(c))) {
//                list.add(new String(c));
//                return;
//            }
//        }else {
//            for(int i = idx; i < c.length; i++) {
//                swap(c,idx,i);
//                dfs(c,idx + 1);
//                swap(c,idx,i);
//            }
//        }
//
//    }
//    public void swap(char[] c,int i,int j) {
//        if(i != j) {
//            char tmp = c[i];
//            c[i] = c[j];
//            c[j] = tmp;
//        }
//    }
}
