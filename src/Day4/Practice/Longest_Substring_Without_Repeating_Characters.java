package Day4.Practice;

public class Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
    public static int lengthOfLongestSubstring(String s) {
        int[] f = new int[128];
        int ans = 0;
        int ei=0;
        int n = s.length();
        int si = 0;
        while(ei<n){
            while(f[s.charAt(ei)] > 0){
                f[s.charAt(si)]--;
                si++;
            }

            f[s.charAt(ei)]++;
            int len = ei-si+1;
            ans = Math.max(ans, len);
            ei++;
        }
        return ans;
    }
}
