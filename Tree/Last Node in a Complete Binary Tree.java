public class Solution {
    public int lastNode(TreeNode A) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        
        ArrayList<Integer> ans = new ArrayList<Integer>();
        queue.add(A);
        
        while(!queue.isEmpty()){
           TreeNode curr = queue.poll();
           ans.add(curr.val);
           
           if(curr.left != null) queue.add(curr.left);
           if(curr.right != null) queue.add(curr.right);
           
            
        }
        int last = ans.get(ans.size() - 1);
        return last;
    }
}

TC - 0(N)
  It could also be done in 0(logn* logn).
