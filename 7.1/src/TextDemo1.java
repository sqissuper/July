import java.util.*;

/**
 * ClassName:TextDemo1
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Author:HP
 * @date:2021/7/1 16:45
 */
public class TextDemo1 {

    //01背包问题
//    public static int maxValue(int[] value,int[] weight,int N,int V) {
//        int[][] dp = new int[N][V];
//        for(int i = 0; i < N; i++) {
//            dp[i][0] = 0;
//        }
//        for(int i = 0; i < V; i++) {
//            dp[0][i] = 0;
//        }
//        for(int i = 1; i < N; i++) {
//            for(int j = 1; j < V; j++) {
//                if(j < weight[i]) {
//                    dp[i][j] = dp[i - 1][j];
//                } else {
//                    dp[i][j] = Math.max(dp[i - 1][j],dp[i - 1][j - weight[i]] + value[i]);
//                }
//            }
//        }
//        return dp[N - 1][V - 1];
//    }

    //换钱的最少货币数
//    public int minMoney (int[] arr, int aim) {
//        int[] dp = new int[aim + 1];
//        Arrays.fill(dp,Integer.MAX_VALUE);
//        dp[0] = 0;
//        for(int i = 1; i <= aim; i++) {
//            for(int x : arr) {
//                if(i - x >= 0 && dp[i - x] != Integer.MAX_VALUE) {
//                    dp[i] = Math.min(dp[i],dp[i - x] + 1);
//                }
//            }
//        }
//        return dp[aim] == Integer.MAX_VALUE ? -1 : dp[aim];
//    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int V = sc.nextInt();
//        int[] value = new int[N];
//        int[] weight = new int[N];
//        for(int i = 0; i < N; i++) {
//            value[i] = sc.nextInt();
//            weight[i] = sc.nextInt();
//        }
//        System.out.println(maxValue(value,weight,N,V));
        
    }
}
