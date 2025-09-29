package Day3.leetcode;

import java.util.*;
public class Largest_Rectangle_in_Histogram {
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        System.out.println(Largest_Histogram(heights));
    }
    public static int Largest_Histogram(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int max = 0;
        for(int i=0; i<arr.length; i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                int h = arr[st.pop()];
                int r = i;
                if(st.isEmpty()){
                    max = Math.max(max, h*r);
                }else{
                    int w = r-st.peek()-1;
                    max = Math.max(max, h*w);
                }
            }
            st.push(i);
        }
        int r = arr.length;
        while(!st.isEmpty()){
            int h = arr[st.pop()];
            if(st.isEmpty()){
                max = Math.max(max, h*r);
            }else{
                int w = r-st.peek()-1;
                max = Math.max(max, h*w);
            }
        }
        return max;
    }
}
