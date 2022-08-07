public class Solution {
    public int solve(ListNode A, int B) {
        ListNode curr = A;
        
        int len  = 0;
        
            while(curr != null){
                curr = curr.next;
                len++;
            }
            
            int mid  = (len/2)+1;
            
            int count =  mid - B;
            
            int ans = 0;
            
            if(count <= 0){
                return -1;
            }else{
                ListNode res = A;
                int pointer = 1;
              
                while(res != null){
                   if(pointer  == count){
                       ans = res.val;
                       break;
                   }
                   pointer++;
                   res = res.next;
                }
            }
            
            return ans;
    }
}
