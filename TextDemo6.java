/**
 * ClassName:TextDemo6
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Author:HP
 * @date:2021/7/21 13:31
 */
public class TextDemo6 {
    //JZ20 包含min函数的栈
//    public Stack<Integer> s = new Stack<>();
//    public Stack<Integer> ms = new Stack<>();
//    public void push(int node) {
//        s.push(node);
//        if(ms.isEmpty()) {
//            ms.push(node);
//        } else if(node <= ms.peek()) {
//            ms.push(node);
//        }
//    }
//    public void pop() {
//        int x = s.pop();
//        if(x == ms.peek()) ms.pop();
//    }
//    public int top() {
//        return s.peek();
//    }
//    public int min() {
//        return ms.peek();
//    }

    //JZ21 栈的压入、弹出序列
//    public boolean IsPopOrder(int [] pushA,int [] popA) {
//        Stack<Integer> s = new Stack<>();
//        int index = 0;
//        for(int i = 0; i < pushA.length; i++) {
//            s.push(pushA[i]);
//            while(!s.isEmpty() && s.peek() == popA[index]) {
//                s.pop();
//                index++;
//            }
//        }
//        return s.isEmpty();
//    }

    //JZ22 从上往下打印二叉树
//    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
//        ArrayList<Integer> list = new ArrayList<>();
//        if(root == null) return list;
//        Queue<TreeNode> q = new LinkedList<>();
//        q.offer(root);
//        while(!q.isEmpty()) {
//            TreeNode cur = q.poll();
//            list.add(cur.val);
//            if(cur.left != null) q.offer(cur.left);
//            if(cur.right != null) q.offer(cur.right);
//        }
//        return list;
//    }

    //JZ25 复杂链表的复制
//    public RandomListNode Clone(RandomListNode pHead) {
//        if(pHead == null) return pHead;
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
}
