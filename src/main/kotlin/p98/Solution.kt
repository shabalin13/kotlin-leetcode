package p98

class Solution {
    fun isValidBST(root: TreeNode?): Boolean {
        return helperIsValidBST(Long.MIN_VALUE, Long.MAX_VALUE, root)
    }

    /*
    My approach
    fun helperIsValidBST(minVal: Long, maxVal: Long, root: TreeNode?): Boolean {
        if (root == null) return true

        val left = root.left
        val isValidLeft = if (left == null || (left.`val` > minVal && left.`val` < root.`val`)) helperIsValidBST(
            minVal,
            root.`val`.toLong(),
            left
        ) else false

        val right = root.right
        val isValidRight = if (right == null || (right.`val` > root.`val` && right.`val` < maxVal)) helperIsValidBST(
            root.`val`.toLong(),
            maxVal,
            right
        ) else false

        return isValidLeft && isValidRight
    }
     */

    fun helperIsValidBST(minVal: Long, maxVal: Long, node: TreeNode?): Boolean {
        if (node == null) return true

        val value = node.`val`.toLong()
        if (value <= minVal || value >= maxVal) return false

        return helperIsValidBST(minVal, value, node.left) &&
            helperIsValidBST(value, maxVal, node.right)
    }
}
