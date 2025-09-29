package Day3.leetcode;

public class Search_2D_matrix {
    public static void main(String[] args) {
        int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(arr, 30));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        return solution(matrix, target);
    }

    public static boolean solution(int[][] arr, int target) {
        int n = arr.length;
        int m = arr[0].length;
        int start = 0;
        int end = m * n - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            int row = mid/m;
            int col = mid%m;

            if (arr[row][col] == target) {
                return true;
            } else if (arr[row][col] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
}
