package Day3.leetcode;

public class Search_in2D {
    public static void main(String[] args) {
        int matrix[][] = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}}, target = 5;
        System.out.println(solution(matrix, target));
    }
    public static boolean solution(int[][] arr, int target) {
        int n = arr[0].length-1;
        int m = 0;
        while (m < arr.length && n >= 0) {
            int start = arr[m][n];
            if (start == target) {
                return true;
            } else if (start > target) {
                n--;
            } else {
                m++;
            }
        }
        return false;
    }
}
