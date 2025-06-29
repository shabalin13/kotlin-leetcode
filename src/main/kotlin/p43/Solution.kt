package p43

class Solution {
    fun multiply(num1: String, num2: String): String {
        if (num1 == "0" || num2 == "0") return "0"
        if (num1 == "1") return num2
        if (num2 == "1") return num1

        val result = IntArray(num1.length + num2.length)

        for (i in num1.lastIndex downTo 0) {
            val a = num1[i].digitToInt()
            for (j in num2.lastIndex downTo 0) {
                val b = num2[j].digitToInt()
                val leadingZeros = i + j + 1
                val curry = result[leadingZeros]
                val product = a * b + curry
                result[leadingZeros] = product % 10
                result[leadingZeros - 1] += product / 10
            }
        }

        val sb = StringBuilder()
        val startIdx = if (result[0] == 0) 1 else 0
        for (i in startIdx until result.size) {
            sb.append(result[i])
        }
        return sb.toString()
    }
    
    /*
    fun multiply(num1: String, num2: String): String {
        if (num1 == "0" || num2 == "0") return "0"
        if (num1 == "1") return num2
        if (num2 == "1") return num1

        val num1 = num1.reversed()
        val num2 = num2.reversed()
        val result = IntArray(num1.length + num2.length) { 0 }

        for (i in num1.indices) {
            val a = num1[i].digitToInt()
            for (j in num2.indices) {
                val b = num2[j].digitToInt()
                val leadingZeros = i + j
                val curry = result[leadingZeros]
                val product = a * b + curry
                result[leadingZeros] = product % 10
                result[leadingZeros + 1] += product / 10
            }
        }

        val sb = StringBuilder()
        val endIdx = if (result.last() == 0) result.lastIndex - 1 else result.lastIndex
        for (i in endIdx downTo 0) {
            sb.append(result[i])
        }
        return sb.toString()
    }
     */
}
