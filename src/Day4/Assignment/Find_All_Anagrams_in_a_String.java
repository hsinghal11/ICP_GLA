package Day4.Assignment;

import java.util.*;

//Time complexity: O(n)
//Space complexity: O(1) (excluding output list space)
//The output list ans can hold up to O(n) indices in the worst case.
public class Find_All_Anagrams_in_a_String {
    public static void main(String[] args) {
        String s = "abab", p = "ab";
        System.out.println(findAnagrams(s, p));
    }
    public static List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        int m = p.length();
        List<Integer> ans = new ArrayList<>();
        if(m > n) return ans;
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
                ans.add(si);
            }
            ei++;
        }
        return ans;
    }
}
