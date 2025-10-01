package Day5.Assignment;

import java.util.*;
public class NonOverlappingIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,2},{1,2},{1,2}};
        System.out.println(eraseOverlapIntervals(intervals));
    }
    public static int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a,b) -> a[1]-b[1]);
        int cnt = 0;
        int endIdx = 0;

        for (int i = 1; i < n; i++) {
            if (intervals[i][0] < intervals[endIdx][1]) {
                cnt++;
            }else{
                endIdx = i;
            }
        }

        return cnt;
    }
}
