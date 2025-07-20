package p103

class Solution {
    fun zigzagLevelOrder(root: TreeNode?): List<List<Int>> {
        val result = mutableListOf<List<Int>>()

        if (root == null) return result

        var curLevelNodes = listOf(root)
        var isLeftToRight = true

        while (curLevelNodes.isNotEmpty()) {
            val newLevelNodes = mutableListOf<TreeNode>()
            val newLevelValues = mutableListOf<Int>()

            curLevelNodes.forEach { node ->
                newLevelValues.add(node.`val`)
                node.left?.let(newLevelNodes::add)
                node.right?.let(newLevelNodes::add)
            }

            if (isLeftToRight) {
                result.add(newLevelValues)
            } else {
                result.add(newLevelValues.reversed())
            }
            isLeftToRight = !isLeftToRight
            curLevelNodes = newLevelNodes
        }

        return result
    }
}
