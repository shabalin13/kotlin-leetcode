package p449

/*
Solution using BFS
class Codec() {
    // Encodes a tree to a single string.
    fun serialize(root: TreeNode?): String {
        if (root == null) return ""
        val result = StringBuilder()

        val nodes = LinkedList<TreeNode?>()
        nodes.offer(root)

        while (nodes.isNotEmpty()) {
            val node = nodes.poll()
            result.append("${node?.`val` ?: -1},")
            if (node != null) {
                nodes.add(node.left)
                nodes.add(node.right)
            }
        }

        return result.substring(0, result.lastIndex)
    }

    fun serialize(root: TreeNode?): String {
        if (root == null) return "#"
        return "${root.`val`},${serialize(root.left)},${serialize(root.right)}"
    }

    // Decodes your encoded data to tree.
    fun deserialize(data: String): TreeNode? {
        if (data.isEmpty()) return null

        val nodeVals = data.split(",").map { it.toInt() }
        var idx = 0
        val nodes = LinkedList<TreeNode?>()
        val result = TreeNode(nodeVals[idx++])
        nodes.offer(result)

        while (idx < nodeVals.size) {
            val node = nodes.poll()
            if (node == null) continue
            node.left = if (nodeVals[idx] != -1) TreeNode(nodeVals[idx]) else null
            idx++
            nodes.offer(node.left)
            node.right = if (nodeVals[idx] != -1) TreeNode(nodeVals[idx]) else null
            idx++
            nodes.offer(node.right)
        }

        return result
    }
}
 */

/* Solution using DFS */
class Codec() {
    // Encodes a tree to a single string.
    fun serialize(root: TreeNode?): String {
        if (root == null) return "-1"
        return "${root.`val`},${serialize(root.left)},${serialize(root.right)}"
    }

    // Decodes your encoded data to tree.
    fun deserialize(data: String): TreeNode? {
        val data = data.split(",").map { it.toInt() }
        var idx = 0

        fun helper(): TreeNode? {
            val nodeVal = data[idx++]

            if (nodeVal == -1) return null
            val node = TreeNode(nodeVal)
            node.left = helper()
            node.right = helper()

            return node
        }

        return helper()
    }
}


/**
 * Your Codec object will be instantiated and called as such:
 * val ser = Codec()
 * val deser = Codec()
 * val tree: String = ser.serialize(root)
 * val ans = deser.deserialize(tree)
 * return ans
 */
