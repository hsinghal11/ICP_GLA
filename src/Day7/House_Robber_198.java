package Day7;

import java.util.Arrays;

public class House_Robber_198 {
    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        System.out.println(rob(nums));
    }
    public static   int rob(int[] arr) {
        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);
        return Robber(arr, 0, dp);
    }
    public static int Robber(int[] arr, int i, int[] dp){
        if(i >= arr.length){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int rob = arr[i] + Robber(arr, i+2, dp);
        int dontRob = Robber(arr, i+1, dp);
        return dp[i] = Math.max(rob, dontRob);
    }
}
