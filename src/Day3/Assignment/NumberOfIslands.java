package Day3.Assignment;

public class NumberOfIslands {
    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        System.out.println(numIslands(grid));
    }
    public static int numIslands(char[][] grid) {
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == '1'){
                    solve(grid, i, j);
                    ans++;
                }
            }
        }
        return ans;
    }

    private static void solve(char[][] grid, int i, int j) {
        if(i <0 || i> grid.length || j<0 || j>grid[0].length ||grid[i][j] != '1'){
            return;
        }
        grid[i][j] = '0';
        solve(grid, i+1, j);
        solve(grid, i, j+1);
        solve(grid, i-1, j);
        solve(grid, i, j-1);
    }
}
