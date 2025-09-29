import java.util.Arrays;

public class Dice_Combination {
    public static void main(String[] args) {
        int n = 4;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(ways(n, 0, dp));
    }
    public static int ways(int n, int sum,int[] dp){
        if(sum == n){
            return 1;
        }if(sum > n) return 0;
        if(dp[sum] != -1){
            return dp[sum];
        }
        int ans = 0;
        for (int i = 1; i <= 6; i++) {
            ans += ways(n, sum+i, dp);
        }
        return dp[sum] = ans;
    }
}
