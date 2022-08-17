public class Solution {
    public int[] solve(TreeNode A) {
        Queue<TreeNode> queue = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        
        queue.add(A);
        
        while(!queue.isEmpty()){
            TreeNode curr = queue.poll();
            
            // the only difference here from normal level order traversal is we push the right node 1st.
            if(curr.right != null){
                queue.add(curr.right);
            }
            
            if(curr.left != null){
                queue.add(curr.left);
            }
            
            // use stack to print nodes in reverse order/
            // can also use a list and copy it in an array in reverse order.
            
            stack.push(curr);
            
        }
        
        int res[] = new int[stack.size()];
        int i = 0;
        while(!stack.isEmpty()){
           TreeNode a = stack.pop();
        res[i++] = a.val; 
        }
        return res;
    }  
}
