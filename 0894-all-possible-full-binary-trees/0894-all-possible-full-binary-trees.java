/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    List<TreeNode>[] dp;

    public List<TreeNode> allPossibleFBT(int n) {

        dp = new ArrayList[n + 1];

        return solve(n);
    }

    private List<TreeNode> solve(int n) {

        // Full binary tree cannot have even number of nodes
        if (n % 2 == 0) {
            return new ArrayList<>();
        }

        // Already calculated
        if (dp[n] != null) {
            return dp[n];
        }

        List<TreeNode> result = new ArrayList<>();

        // Base case
        if (n == 1) {
            result.add(new TreeNode(0));
            dp[n] = result;
            return result;
        }

        // Try every possible left subtree size
        for (int leftSize = 1; leftSize < n; leftSize += 2) {

            int rightSize = n - 1 - leftSize;

            List<TreeNode> leftTrees = solve(leftSize);
            List<TreeNode> rightTrees = solve(rightSize);

            // Combine every left tree with every right tree
            for (TreeNode left : leftTrees) {

                for (TreeNode right : rightTrees) {

                    TreeNode root = new TreeNode(0);

                    root.left = left;
                    root.right = right;

                    result.add(root);
                }
            }
        }

        dp[n] = result;

        return result;
    }
}