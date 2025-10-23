package Day9;

public class Remove_Duplicates_from_Sorted_List {

      public class ListNode {
         int val;
          ListNode next;
         ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if(head == null) return head;
            ListNode curr = head;
            ListNode after = head.next;
            while(after != null){
                if(curr.val == after.val){
                    curr.next = after.next;
                }else{
                    curr = after;
                }
                after = after.next;
            }
            return head;
        }
    }
}
