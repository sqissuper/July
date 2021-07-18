/**
 * ClassName:TextDemo3
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Author:HP
 * @date:2021/7/18 14:07
 */
public class TextDemo3 {
    //JZ5 用两个栈实现队列
//    Stack<Integer> stack1 = new Stack<Integer>();
//    Stack<Integer> stack2 = new Stack<Integer>();
//
//    public void push(int node) {
//        stack1.push(node);
//    }
//
//    public int pop() {
//        while(!stack1.isEmpty()) {
//            stack2.push(stack1.pop());
//        }
//        int x = stack2.pop();
//        while(!stack2.isEmpty()) {
//            stack1.push(stack2.pop());
//        }
//        return x;
//    }

    //JZ6 旋转数组的最小数字
//    public int minNumberInRotateArray(int [] array) {
//        if(array == null || array.length == 0) return 0;
//        Arrays.sort(array);
//        return array[0];
//    }

//    JZ7 斐波那契数列
//    public int Fibonacci(int n) {
//        if(n == 0) return 0;
//        int[] dp = new int[n + 1];
//        dp[0] = 0;
//        dp[1] = 1;
//        for(int i = 2; i <= n; i++) {
//            dp[i] = dp[i - 1] + dp[i - 2];
//        }
//        return dp[n];
//    }


    //JZ10 矩形覆盖
//    public int rectCover(int target) {
//        if(target <= 0) return 0;
//        int[] dp = new int[target + 1];
//        if(target > 0 && target < 3) return target;
//        dp[0] = 0;
//        dp[1] = 1;
//        dp[2] = 2;
//        for(int i = 3; i <= target; i++) {
//            dp[i] = dp[i - 1] + dp[i - 2];
//        }
//        return dp[target];
//    }
    public static void main(String[] args) {
//        System.out.println(Fibonacci(4));
//        System.out.println(rectCover(1));
    }
}
