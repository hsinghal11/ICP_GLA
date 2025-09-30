package Day4.Assignment;

import java.util.Arrays;

// Time complexity: O(N+M)
// Space Complexity: O(1)
public class Permutation_in_String {
    public static void main(String[] args) {
        String s1 = "ab", s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));
    }
    public static boolean checkInclusion(String p, String s) {
        int n = s.length();
        int m = p.length();
        if(m > n) return false;
        int[] f1 = new int[128];
        int[] f2 = new int[128];
        for(char c: p.toCharArray()){
            f1[c]++;
        }
        int si = 0;
        int c = 0;
        int ei = 0;
        while(ei<n && si<n){
            // groww
            f2[s.charAt(ei)]++;

            // shrink
            while(ei-si+1 >m){
                f2[s.charAt(si)]--;
                si++;
            }

            // update
            if(ei-si+1 == m && Arrays.equals(f1, f2)){
                return true;
            }
            ei++;
        }
        return false;
    }
}
