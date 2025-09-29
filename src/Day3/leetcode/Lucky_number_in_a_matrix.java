package Day3.leetcode;

import java.util.*;
public class Lucky_number_in_a_matrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        List<Integer> l = luckyNumbers(matrix);
        System.out.println(l);
    }
    public static List<Integer> luckyNumbers(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<m; i++){
            int min = Integer.MAX_VALUE;
            int idx = 0;
            for(int j=0; j<n; j++){
                if(arr[i][j] < min){
                    min = arr[i][j];
                    idx = j;
                }
            }
            int max = 0;
            int maxi = -1;
            for(int k=0; k<m; k++){
                if(arr[k][idx] > max){
                    max = arr[k][idx];
                }
            }
            if(min == max) ans.add(min);
        }
        return ans;
    }
}
