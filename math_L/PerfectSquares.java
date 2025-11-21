package math_L;
import java.util.*;
class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            dp[i] = i; 
            for (int j = 1; j * j <= i; j++) {
                int square = j * j;
                dp[i] = Math.min(dp[i], 1 + dp[i - square]);
            }
        }
        return dp[n];
    }
}
public class PerfectSquares{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        Solution sol = new Solution();
        int result = sol.numSquares(n);

        System.out.println("Minimum Perfect Squares = " + result);
        sc.close();
    }
}