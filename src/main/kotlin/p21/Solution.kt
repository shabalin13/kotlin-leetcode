package p21

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var list1 = list1
        var list2 = list2
        var list3 = ListNode(0)
        val result = list3

        while (list1 != null && list2 != null) {
            if (list1.`val` < list2.`val`) {
                list3.next = list1
                list1 = list1.next
            } else {
                list3.next = list2
                list2 = list2.next
            }
            list3 = list3.next!!
        }

        list3.next = list1 ?: list2

        return result.next
    }
}
