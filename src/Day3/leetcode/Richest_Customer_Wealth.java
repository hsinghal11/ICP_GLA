package Day3.leetcode;

public class Richest_Customer_Wealth {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(maximumWealth(arr));
    }

    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int summ = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                summ += accounts[i][j];
            }
            max = Math.max(summ, max);
            summ = 0;
        }
        return max;
    }
}
