package microsoft;

import java.util.Arrays;

public class PrefixSum {
    public static void main(StringQues[] args) {
        int[] block = {1,5,5,2,6};
        System.out.println(solution(block));
    }
    public static int solution(int[] blocks) {
        int n = blocks.length;
        int[] farRight = new int[n];
        int farR = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (i + 1 < n && blocks[i] > blocks[i + 1]) {
                farR = i;
            }
            farRight[i] = farR;
        }
        System.out.println(Arrays.toString(farRight));
        int farLeft = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (i - 1 >= 0 && blocks[i - 1] < blocks[i]) {
                farLeft = i;
                System.out.println("farLeft called ->"+i +" th index"+ farLeft);
            }
            int len = farRight[i] - farLeft + 1;
            System.out.println("tis is len ->" + len);
            ans = Math.max(ans, len);
            System.out.println("tis is ans ->" + ans);
        }
        return ans;
    }
}
