package Day1;

import java.util.*;

public class Sliding_Window_Maximum {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        System.out.println(Arrays.toString(maxSlidingWindow(nums,k)));
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length - k+1];
        int n = nums.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        // initial window
        for (int i = 0; i < k; i++) {
            pq.add(new int[]{nums[i], i});
        }
        assert pq.peek() != null;
        ans[0] = pq.peek()[0];

        for (int i = k; i < n; i++) {
            pq.add(new int[]{nums[i], i});

            // remove elements out of window
            while (pq.peek()[1] <= i - k) {
                pq.poll();
            }

            ans[i - k + 1] = pq.peek()[0];
        }
        return ans;
    }
}
