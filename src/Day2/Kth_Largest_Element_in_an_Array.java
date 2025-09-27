package Day2;

import java.util.PriorityQueue;

public class Kth_Largest_Element_in_an_Array {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(nums[i]);
        }
        for (int i = k; i < nums.length; i++) {
            if(pq.peek() < nums[i]){
                pq.poll();
                pq.add(nums[i]);
            }
        }
        System.out.println(pq.poll());
    }
}
