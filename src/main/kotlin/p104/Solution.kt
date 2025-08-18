package p104

import java.util.LinkedList

class Solution {
    /* DFS */
    fun maxDepth(root: TreeNode?): Int {
        if (root == null) return 0
        return maxOf(maxDepth(root.left), maxDepth(root.right)) + 1
    }

    /* BFS
    fun maxDepth(root: TreeNode?): Int {
        if (root == null) return 0

        val queue = LinkedList<TreeNode>()
        queue.add(root)
        var depth = 0

        while (queue.isNotEmpty()) {
            depth++

            repeat(queue.size) {
                val node = queue.poll()
                node.left?.let { queue.add(it) }
                node.right?.let { queue.add(it) }
            }
        }

        return depth
    }
     */
}
