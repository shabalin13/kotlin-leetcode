package p933

import java.util.LinkedList

/**
 * Your RecentCounter object will be instantiated and called as such:
 * var obj = RecentCounter()
 * var param_1 = obj.ping(t)
 */

/*
Stupid solution (not optimized)
class RecentCounter() {
    private val requests = mutableListOf<Int>()

    fun ping(t: Int): Int {
        requests.add(t)
        return requests.count { it >= t - 3000 && it <= t }
    }
}
 */

/*
Using a linked list
class RecentCounter() {
    private val requests = LinkedList<Int>()

    fun ping(t: Int): Int {
        requests.offer(t)

        while (t - 3000 > requests.peek()) {
            requests.poll()
        }

        return requests.size
    }
}
 */


/* Head + Tail */
class RecentCounter() {
    private var requests = IntArray(10000)
    private var head = 0
    private var tail = 0

    fun ping(t: Int): Int {
        requests[tail++] = t
        while (t - 3000 > requests[head]) head++
        return tail - head
    }
}
