package Day3.leetcode;

import java.util.*;
public class Shift_2D_Grid {
    public static void main(String[] args) {
        int grid[][] = {{3,8,1,9},{19,7,2,5},{4,6,11,10},{12,0,21,13}}, k = 4;
        List<List<Integer>> ans = shiftGrid(grid, k);
        System.out.println(ans);
    }
    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        int m = grid.length;
        int n = grid[0].length;
        k = k%(m*n);
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(0);
            }
            ans.add(row);
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int oldIdx = i*n + j;
                int newIdx = (oldIdx+k)%(m*n);
                int newR = newIdx/n;
                int newC = newIdx%n;
                ans.get(newR).set(newC, grid[i][j]);
            }
        }
        return ans;
    }
}
