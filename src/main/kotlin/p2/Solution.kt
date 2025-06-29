package p2

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var l1 = l1
        var l2 = l2
        val result = ListNode(0)
        var l3 = result
        var memoryNumber = 0

        while (l1 != null || l2 != null || memoryNumber != 0) {
            val l1Val = l1?.`val` ?: 0
            val l2Val = l2?.`val` ?: 0
            val addResult = l1Val + l2Val + memoryNumber

            l1 = l1?.next
            l2 = l2?.next
            memoryNumber = addResult / 10
            val next = ListNode(addResult % 10)
            l3.next = next
            l3 = next
        }
        return result.next
    }

    /*
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var l1 = l1
        var l2 = l2
        var l3 = ListNode(0)
        val result = l3

        while (l1 != null || l2 != null) {
            var addResult = l3.`val`
            if (l1 != null && l2 != null) {
                addResult += l1.`val` + l2.`val`
            } else if (l1 != null) {
                addResult += l1.`val`
            } else if (l2 != null) {
                addResult += l2.`val`
            }

            l1 = l1?.next
            l2 = l2?.next
            l3.`val` = addResult % 10
            val next = ListNode(addResult / 10)
            if (l1 == null && l2 == null && next.`val` == 0) {
                l3.next = null
            } else {
                l3.next = next
                l3 = next
            }
        }
        return result
    }
     */
}
