public class Solution {
    public ListNode removeNthFromEnd(ListNode A, int B) {
        int len = 0;
        
        ListNode temp = A;
        
        while(temp != null){
            temp = temp.next;
            len++;
        }
        
        int count =  len - B;
        
        if(count <= 0){
            return A.next;
        }else{
            ListNode curr = A;
            int pointer = 1;
            while(curr != null){
                if(pointer == count ){
                    curr.next = curr.next.next;
                }
                pointer++;
                curr = curr.next;
            }
        }
        return A;
    }
}
