package p19

class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        val result = ListNode(-1).apply { next = head }
        var left: ListNode? = result
        var right: ListNode? = result

        repeat(n + 1) {
            right = right?.next
        }

        while (right != null) {
            right = right.next
            left = left?.next
        }

        left?.next = left.next?.next
        return result.next
    }
}
