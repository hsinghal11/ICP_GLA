package Day4.Assignment;

public class Max_Consecutive_Ones_III {
    public static void main(String[] args) {
        int nums[] = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, k = 3;
        System.out.println(longestOnes(nums, k));
    }
    public static int longestOnes(int[] nums, int k) {
        int si = 0, ei = 0, ans = 0, n = nums.length, flip = 0;
        while(ei < n){
            if(nums[ei] == 0) flip++;

            while(flip > k){
                if(nums[si] == 0) flip--;
                si++;
            }

            ans = Math.max(ans, ei-si+1);
            ei++;
        }
        return ans;
    }
}
