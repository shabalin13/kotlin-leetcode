package p404

class Solution {
    fun sumOfLeftLeaves(root: TreeNode?): Int {
        fun helperDFS(root: TreeNode?, isLeft: Boolean): Int {
            if (root == null) return 0
            if (root.left == null && root.right == null ) return if (isLeft) root.`val` else 0
            return helperDFS(root?.left, true) + helperDFS(root?.right, false)
        }

        return helperDFS(root, false)
    }
}
