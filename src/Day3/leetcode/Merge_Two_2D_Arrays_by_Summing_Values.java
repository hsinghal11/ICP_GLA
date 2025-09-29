package Day3.leetcode;

import java.util.*;
public class Merge_Two_2D_Arrays_by_Summing_Values {
    public static void main(String[] args) {
        int nums1[][] = {{2,4},{3,6},{5,5}}, nums2[][] = {{1,3},{4,3}};
        int[][] ans = mergeArrays(nums1, nums2);
        for(int[] a:ans){
            System.out.println(Arrays.toString(a));
        }
    }
    public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        ArrayList<int[]> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        int n = nums1.length, m = nums2.length;
        while(i<n && j<m){
            if(nums1[i][0] == nums2[j][0]){
                ans.add(new int[]{nums1[i][0], nums1[i][1]+nums2[j][1]});
                i++;
                j++;
            }else if(nums1[i][0] > nums2[j][0]){
                ans.add(nums2[j]);
                j++;
            }else if(nums1[i][0] < nums2[j][0]){
                ans.add(nums1[i]);
                i++;
            }
        }
        while(i<n){
            ans.add(nums1[i]);
            i++;
        }

        while(j<m){
            ans.add(nums2[j]);
            j++;
        }

        int[][] arr = new int[ans.size()][2];
        for(int k=0; k<arr.length; k++){
            arr[k] = ans.get(k);
        }
        return arr;
    }
}
