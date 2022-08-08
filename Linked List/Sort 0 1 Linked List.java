public class Solution {
    public ListNode solve(ListNode A) {
        if(A == null || A.next == null){
            return A;
        }
        
        int count0 = 0;
        int count1 = 0;
        
        ListNode temp = A;
        while(temp != null){
            if(temp.val == 0){
                count0++;
            }
            if(temp.val == 1){
                count1++;
            }
            temp = temp.next;
        }
        temp = A;
        
        
        // count all the nos of 0s and 1s.
        // change the first count0 elements to 0 && remaining with 1.
        
        
        while(count0 > 0){
            temp.val = 0;
            temp = temp.next;
            count0--;
        }
        
        while(count1 > 0){
            temp.val = 1;
            temp = temp.next;
            count1--;
        }
        return A;
    }
}
