/*

Problem Link :- https://leetcode.com/problems/validate-binary-tree-nodes/

You have n binary tree nodes numbered from 0 to n - 1 where node i has two children leftChild[i] and rightChild[i], return true if and only if all the given nodes form exactly one valid binary tree.

If node i has no left child then leftChild[i] will equal -1, similarly for the right child.

Note that the nodes have no values and that we only use the node numbers in this problem.

Input: n = 4, leftChild = [1,-1,3,-1], rightChild = [2,-1,-1,-1]
Output: true
*/ 




// Full function (SOLUTION)
public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        int[] parent = new int[n];
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) dp[i] = parent[i] = -1;
        int countP = 0;
        for (int i = 0; i < n; i++)
            if (validateNode(i, leftChild, rightChild, parent, dp) == 0) return false;
        for (int i = 0; i < n && countP <= 1; i++) countP += parent[i] == -1 ? 1 : 0;
        return countP <= 1;
    }

    public int validateNode(int node, int[] lc, int[] rc, int[] parent, int[] dp) {
        if (node == -1) return 1;
        if (dp[node] != -1) return dp[node];
        if (lc[node] != -1 && parent[lc[node]] != -1) return dp[node] = 0;
        if (lc[node] != -1) parent[lc[node]] = node;
        if (rc[node] != -1 && parent[rc[node]] != -1) return dp[node] = 0;
        if (rc[node] != -1) parent[rc[node]] = node;
        return dp[node] = (validateNode(rc[node], lc, rc, parent, dp) == 1 &&
                validateNode(lc[node], lc, rc, parent, dp) == 1)
                ? 1 : 0;
    }