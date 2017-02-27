package abhishek.com.java.practice;

import java.util.Scanner;

/**
 * Created by abhishek on 14/12/16.
 */

public class CoinChangingProblem {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        int[] coins = new int[M];
        for(int i = 0 ; i < M ;i++){
            coins[i] = s.nextInt();
        }

        System.out.println("coins = " + coinChange(coins,N));
    }


    public static int coinChange(int[] coins, int amount) {
        if (amount == 0)
            return 0;
        int[] dp = new int[amount + 1];
        dp[0] = 0;
        for (int i = 1; i <= amount; i++)
            dp[i] = Integer.MAX_VALUE;
        for (int i = 0; i <= amount; i++) {
            for (int coin : coins) {
                if (i + coin <= amount) {
                    if (dp[i] == Integer.MAX_VALUE) {
                        dp[i + coin] = dp[i + coin];
                    } else {
                        dp[i + coin] = Math.min(dp[i + coin], dp[i] + 1);
                    }
                }
            }
        }
        if (dp[amount] >= Integer.MAX_VALUE) return -1;
        return dp[amount];
    }
}