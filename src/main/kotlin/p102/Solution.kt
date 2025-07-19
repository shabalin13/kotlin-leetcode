package p102

class Solution {
    /* BFS with List */
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val result = mutableListOf<List<Int>>()

        if (root == null) return result

        var curLevelNodes = listOf(root)

        while (curLevelNodes.isNotEmpty()) {
            val newLevelNodes = mutableListOf<TreeNode>()
            val curLevelValues = mutableListOf<Int>()
            curLevelNodes.forEach { node ->
                curLevelValues.add(node.`val`)
                node.left?.let(newLevelNodes::add)
                node.right?.let(newLevelNodes::add)
            }
            result.add(curLevelValues)
            curLevelNodes = newLevelNodes
        }

        return result
    }

    /*
    BFS with Queue
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val result = mutableListOf<List<Int>>()

        if (root == null) return result

        val queue: Queue<TreeNode> = LinkedList()
        queue.offer(root)

        while (queue.isNotEmpty()) {
            val levelValues = mutableListOf<Int>()
            repeat(queue.size) {
                val node = queue.poll()
                levelValues.add(node.`val`)
                node.left?.let(queue::offer)
                node.right?.let(queue::offer)
            }
            result.add(levelValues)
        }

        return result
    }
     */

    /*
    DFS
    fun levelOrder(root: TreeNode?): List<List<Int>> {

        val levelToNodes = mutableMapOf<Int, MutableList<Int>>()

        fun dfs(level: Int, node: TreeNode?) {
            if (node == null) return

            levelToNodes.getOrPut(level) { mutableListOf() }.add(node.`val`)

            dfs(level + 1, node.left)
            dfs(level + 1, node.right)
        }

        dfs(0, root)

        val result = mutableListOf<List<Int>>()
        for (i in 0 until levelToNodes.keys.size) {
            result += levelToNodes[i]!!
        }

        return result
    }
     */
}
