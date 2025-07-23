package p141

class Solution {
    /* Floyd's Tortoise and Hare algorithm (Fast and Slow) */
    fun hasCycle(head: ListNode?): Boolean {
        var slow = head
        var fast = head

        while (fast?.next != null) {
            slow = slow?.next
            fast = fast.next?.next

            if (fast == slow) return true
        }

        return false
    }

    /*
    fun hasCycle(head: ListNode?): Boolean {
        val visited = mutableSetOf<ListNode>()

        var cur = head
        while (cur != null) {
            if (cur in visited) return true
            visited.add(cur)
            cur = cur.next
        }

        return false
    }
     */

    /*
    My O(1) memory
    fun hasCycle(head: ListNode?): Boolean {
        var cur = head

        repeat(10001) {
            if (cur == null) return false
            cur = cur.next
        }

        return true
    }
     */
}
