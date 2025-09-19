package p235

class Solution {
    /*
    Too much conditions
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        if (root == null || p == null || q == null) return null
        if (p.`val` < q.`val`)  {
            if (root.`val` >= p.`val` && root.`val` <= q.`val`) return root
            if (root.`val` > q.`val`) return lowestCommonAncestor(root.left, p, q)
            return lowestCommonAncestor(root.right, p, q)
        } else {
            if (root.`val` <= p.`val` && root.`val` >= q.`val`) return root
            if (root.`val` > p.`val`) return lowestCommonAncestor(root.left, p, q)
            return lowestCommonAncestor(root.right, p, q)
        }
    }
     */

    /* Simplified conditions */
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        if (root == null || p == null || q == null) return null
        if (p.`val` < root.`val` && q.`val` < root.`val`) return lowestCommonAncestor(root.left, p, q)
        if (p.`val` > root.`val` && q.`val` > root.`val`) return lowestCommonAncestor(root.right, p, q)
        return root
    }
}
