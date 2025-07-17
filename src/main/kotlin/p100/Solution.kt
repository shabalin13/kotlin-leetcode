package p100

class Solution {
    /* DFS */
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        if (p == null && q == null) return true
        if (p?.`val` != q?.`val`) return false
        return isSameTree(p?.left, q?.left) && isSameTree(p?.right, q?.right)
    }

    /*
    BFS
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        val pQueue: Queue<TreeNode?> = LinkedList()
        val qQueue: Queue<TreeNode?> = LinkedList()
        pQueue.offer(p)
        qQueue.offer(q)
        while (!(pQueue.isEmpty() && qQueue.isEmpty())) {
            val n = pQueue.size
            val m = qQueue.size
            if (m != n) {
                return false;
            }
            for (i in 0..<n) {
                val qNode = qQueue.poll()
                val pNode = pQueue.poll()
                if (!isEqualNode(pNode, qNode)) {
                    return false
                }
                if (pNode != null) {
                    pQueue.offer(pNode.right)
                    pQueue.offer(pNode.left)
                }
                if (qNode != null) {
                    qQueue.offer(qNode.right)
                    qQueue.offer(qNode.left)
                }
            }
        }
        return qQueue.isEmpty() && pQueue.isEmpty()
    }

    fun isEqualNode(p: TreeNode?, q: TreeNode?): Boolean {
        if (q == null && p == null) {
            return true
        }
        if (p == null || q == null || p.`val` != q.`val`) {
            return false
        }
        return true
    }
     */
}
