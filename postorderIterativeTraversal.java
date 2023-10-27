//solution to leetcode question: https://leetcode.com/problems/binary-tree-postorder-traversal/description/
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null) return new ArrayList<>();
        List<Integer> postorder = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while(curr != null || !stack.empty()){
            while(curr != null){
                stack.push(curr);
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            if(stack.size()>0 && curr == stack.peek()) curr = curr.right;
            else {
                postorder.add(curr.val);
                curr = null;
            }
        }
        return postorder;
    }
}