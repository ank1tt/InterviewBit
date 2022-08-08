public class Solution {
    public ListNode deleteDuplicates(ListNode A) {
       if(A == null || A.next == null){
           return A;
       }
       
       ListNode prev = null, curr = A, ansHead = null;
       int count = 0;
       
     while(curr != null){
         // check duplicate nodes if count >=1 duplicate exists.
           while(curr.next != null && curr.val == curr.next.val){
           count++;
           curr = curr.next;
       }
       // if duplicate is there eliminate all duplicates.
       if(count >= 1){
           curr = curr.next;
           if(prev != null) prev.next = curr;
       }else{
           // if not we move our prev by 1.
           prev = curr;
           curr = curr.next;
           if(ansHead == null) ansHead = prev;
       }
       
       count = 0;
       
     }
     return ansHead; 
    }
}


