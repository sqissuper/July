/**
 * ClassName:TextDemo12
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Author:HP
 * @date:2021/7/28 17:38
 */
public class TextDemo12 {
    //JZ58 对称的二叉树
//    boolean isSymmetrical(TreeNode pRoot) {
//        if(pRoot == null) return true;
//        return func(pRoot.left,pRoot.right);
//    }
//    boolean func(TreeNode left,TreeNode right) {
//        if(left == null && right != null || left != null && right == null) return false;
//        if(left == null && right == null) return true;
//        if(left.val != right.val) return false;
//        return func(left.left,right.right) && func(left.right,right.left);
//    }


    //JZ59 按之字形顺序打印二叉树
//    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
//        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
//        if(pRoot == null) return res;
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(pRoot);
//        int count = 0;
//        while(!queue.isEmpty()) {
//            ArrayList<Integer> list = new ArrayList<>();
//            int size = queue.size();
//            for(int i = 0; i < size; i++) {
//                TreeNode cur = queue.poll();
//                if(count  % 2 == 1) {
//                    list.add(0,cur.val);
//                } else {
//                    list.add(cur.val);
//                }
//                if(cur.left != null) queue.offer(cur.left);
//                if(cur.right != null) queue.offer(cur.right);
//            }
//            count++;
//            res.add(list);
//        }
//        return res;
//    }

    //JZ62 二叉搜索树的第k个结点
//    ArrayList<TreeNode> list = new ArrayList<>();
//    public TreeNode KthNode(TreeNode pRoot, int k) {
//        if(pRoot == null || k <= 0) return null;
//        add(pRoot);
//        if(k > list.size()) return null;
//        return list.get(k - 1);
//    }
//    public void add(TreeNode pRoot) {
//        if(pRoot == null) return;
//        add(pRoot.left);
//        list.add(pRoot);
//        add(pRoot.right);
//    }
    public static void main(String[] args) {

    }
}
