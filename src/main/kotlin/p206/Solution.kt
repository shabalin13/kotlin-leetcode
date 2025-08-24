package p206

class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        var curNode: ListNode? = head
        var prevNode: ListNode? = null

        while (curNode != null) {
            val nextNode = curNode.next
            curNode.next = prevNode
            prevNode = curNode
            curNode = nextNode
        }

        return prevNode
    }
}
