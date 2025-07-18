package p101

import java.util.*

class Solution {
    /*
    DFS
    fun isSymmetric(root: TreeNode?): Boolean {
        return helperIsSymmetric(root?.left, root?.right)
    }

    fun helperIsSymmetric(left: TreeNode?, right: TreeNode?): Boolean {
        if (left == null && right == null) return true
        if (left?.`val` != right?.`val`) return false
        return helperIsSymmetric(left?.left, right?.right) && helperIsSymmetric(left?.right, right?.left)
    }
     */

    /* BFS */
    fun isSymmetric(root: TreeNode?): Boolean {
        val leftNodes: Queue<TreeNode?> = LinkedList()
        val rightNodes: Queue<TreeNode?> = LinkedList()
        leftNodes.offer(root?.left)
        rightNodes.offer(root?.right)

        while (leftNodes.isNotEmpty() && rightNodes.isNotEmpty()) {
            val leftNode = leftNodes.poll()
            val rightNode = rightNodes.poll()

            if (leftNode == null && rightNode == null) continue
            if (leftNode?.`val` != rightNode?.`val`) return false

            leftNodes.offer(leftNode?.left)
            leftNodes.offer(leftNode?.right)
            rightNodes.offer(rightNode?.right)
            rightNodes.offer(rightNode?.left)

        }

        return leftNodes.isEmpty() && rightNodes.isEmpty()
    }
}
