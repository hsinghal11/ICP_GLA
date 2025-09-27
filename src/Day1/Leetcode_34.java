package Day1;

import java.util.*;
public class Leetcode_34 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] ans = {-1, -1};
        ans[0] = BS(nums, target, true);
        ans[1] = BS(nums, target, false);
        System.out.println(Arrays.toString(ans));
    }

    public static int BS(int[] nums, int target, boolean LR) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid;
                if (LR) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }


        }
        return ans;

    }
}
