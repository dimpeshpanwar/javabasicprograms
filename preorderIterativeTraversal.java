
//solution to leetcode question: https://leetcode.com/problems/binary-tree-preorder-traversal/description/
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();

        while(stack.size()>0 || root!=null){
            while(root!=null){
                list.add(root.val);
                stack.push(root);
                root = root.left;
            }
            root = stack.pop().right;
        }
        return list;
    }
}