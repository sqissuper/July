import java.util.ArrayList;

/**
 * ClassName:TextDemo10
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Author:HP
 * @date:2021/7/26 15:00
 */
public class TextDemo10 {
    //JZ38 二叉树的深度
//    public int TreeDepth(TreeNode root) {
//        if(root == null) return 0;
//        int left = TreeDepth(root.left);
//        int right = TreeDepth(root.right);
//        return left > right ? left + 1 : right + 1;
//    }

    //JZ39 平衡二叉树
//    public boolean IsBalanced_Solution(TreeNode root) {
//        if(func(root) >= 0) return true;
//        return false;
//    }
//    public int func(TreeNode root) {
//        if(root == null) return 0;
//        int l = func(root.left);
//        int r = func(root.right);
//        if(l >= 0 && r >= 0 && Math.abs(l - r) <= 1) {
//            return Math.max(l,r) + 1;
//        }
//        return -1;
//    }

    //JZ40 数组中只出现一次的两个数字
//    public int[] FindNumsAppearOnce (int[] array) {
//        int[] arr = new int[2];
//        Arrays.sort(array);
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i = 0; i < array.length; i++) {
//            if(map.containsKey(array[i])) {
//                int tmp = map.get(array[i]);
//                map.put(array[i],tmp + 1);
//            } else {
//                map.put(array[i],1);
//            }
//        }
//        int k = 0;
//        for(int i = 0; i < array.length; i++) {
//            if(map.get(array[i]) == 1) arr[k++] = array[i];
//        }
//        return arr;
//    }


    //JZ44 翻转单词序列
//    public String ReverseSentence(String str) {
//        StringBuilder sb = new StringBuilder();
//        String[] strs = str.split(" ");
//        for(int i = strs.length - 1; i >= 0; i--) {
//            sb.append(strs[i]).append(" ");
//        }
//        return sb.toString().trim();
//    }

    //JZ45 扑克牌顺子
//    public boolean IsContinuous(int [] numbers) {
//        Arrays.sort(numbers);
//        int n = numbers.length;
//        if(n != 5) return false;
//        int count = 0;
//        for(int x : numbers) {
//            if(x == 0) count++;
//        }
//        for(int i = count + 1; i < 5; i++) {
//            if(numbers[i] == numbers[i - 1]) return false;
//        }
//        int tmp = numbers[4] - numbers[count];
//        if(tmp > 4) return false;
//        return true;
//    }

    public static void main(String[] args) {
//        int[] a = {1,2,4,7,11,15};
//        int n = 15;
//        FindNumbersWithSum(a,n).forEach(x-> System.out.println(x));
    }
}
