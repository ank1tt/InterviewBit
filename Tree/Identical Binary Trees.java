
// https://www.interviewbit.com/problems/identical-binary-trees/

public class Solution {
    public int isSameTree(TreeNode A, TreeNode B) {
        if(helper(A,B)){
            return 1;
        }else{
            return 0;
        }
    }
    public boolean helper(TreeNode A , TreeNode B){
        if(A == null && B == null){
            return true;
        }
        else if(A != null && B != null && A.val == B.val){
            return helper(A.left, B.left) && helper(A.right, B.right);
        }
        return false;
    }
}
