package p938

class Solution {
    /* Traverse all nodes */
    fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int {
        if (root == null) return 0
        val sum = if (root.`val` >= low && root.`val` <= high) root.`val` else 0
        return sum + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high)
    }

    /*
    A little bit optimized (traverse not all nodes)
    fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int {
        if (root == null) return 0
        return when {
            root.`val` < low -> rangeSumBST(root.right, low, high)
            root.`val` > high -> rangeSumBST(root.left, low, high)
            else -> root.`val` + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high)
        }
    }
     */
}
