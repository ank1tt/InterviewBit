
// https://www.interviewbit.com/problems/path-sum/

public class Solution {
    public int hasPathSum(TreeNode A, int B) {
      if(helper(A,B)){
          return 1;
      }else{
          return 0;
      }
    }
    public boolean helper(TreeNode root, int target){
        if(root == null){
            return false;
        }
        
        if(root.left == null && root.right == null){
            return(target - root.val) == 0;
        }
        return helper(root.left, target - root.val) || helper(root.right , target - root.val);
    }
}
