package Day5.Practice;

import java.util.*;
// Using Sorting - O(n * log(n)) Time and O(n) Space
public class Activity_selection {
    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5}, finish[] = {2, 4, 6, 7, 9, 9};
        System.out.println(activitySelection(start, finish));
    }
    public static int activitySelection(int[] start, int[] finish) {
        // code here
        int n = start.length;
        int[][] time = new int[n][2];
        for(int i=0; i<n; i++){
            time[i][0] = start[i];
            time[i][1] = finish[i];
        }

        Arrays.sort(time, (a,b) -> a[1]-b[1]);
        int cnt = 1;
        int lastIdx = 0;
        for(int i=1; i<n; i++){
            if(time[lastIdx][1] < time[i][0]){
                cnt++;
                lastIdx = i;
            }
        }
        return cnt;
    }
}
