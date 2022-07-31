
// https://www.interviewbit.com/problems/right-view-of-binary-tree/


public class Solution {
    public int[] solve(TreeNode A) {
        ArrayList<Integer> ans = new ArrayList<>();
        rightview(A, ans, 0);
        int len = ans.size();
        int[] res = new int[len];
        
        for(int i = 0; i < len; i++){
            res[i] = ans.get(i);
        }
        return res;
        
    }
    public  void rightview(TreeNode  root, ArrayList<Integer> ans , int depth){
        if(root == null){
            return;
        }
        if(ans.size() == depth){
            ans.add(root.val);
        }
        rightview(root.right, ans , depth+1);
        rightview(root.left, ans , depth+1);
    }    
}
