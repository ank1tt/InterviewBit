
// https://www.interviewbit.com/problems/symmetric-binary-tree/

public class Solution {
     public boolean helper(TreeNode p, TreeNode q){
      
      
       if(p == null && q == null){
            return true;
        }
        
      
       
       if(p == null || q == null){
            return false;
        }
       
       
        if(p.val != q.val){
            return false;
        }
        
       
        
        
        return helper(p.left, q.right) && helper(p.right, q.left);
    }
    public int isSymmetric(TreeNode A) {
        
        if( A == null){
            return 1;
        }
        if(helper(A.left, A.right) == true){
            return 1;
        }else{
            return 0;
        }
    
   
}
}
