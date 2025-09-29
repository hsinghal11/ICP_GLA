package Day3.leetcode;

import java.util.Arrays;
import java.util.Stack;

public class Help_Classmate {
    public static void main(String[] args) {
        int N = 5, arr[] = {3, 8, 5, 2, 25};
        System.out.println(Arrays.toString(help_classmate(arr, N)));
    }

    public static int[] help_classmate(int arr[], int n) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return ans;
    }
}
