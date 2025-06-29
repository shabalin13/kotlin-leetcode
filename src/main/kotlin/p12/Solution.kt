package p12

class Solution {
    val values = arrayOf(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
    val romans = arrayOf("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I")

    fun intToRoman(num: Int): String {
        var num = num

        return buildString {
            values.forEachIndexed { i, value ->
                if (num / value > 0) {
                    repeat(num / value) {
                        append(romans[i])
                    }
                    num %= value
                }
            }
        }
    }
}


/*
class Solution {
    val valueToRoman = mapOf(
        1 to "I",
        5 to "V",
        10 to "X",
        50 to "L",
        100 to "C",
        500 to "D",
        1000 to "M",

        4 to "IV",
        9 to "IX",
        40 to "XL",
        90 to "XC",
        400 to "CD",
        900 to "CM"
    )
    val values = valueToRoman.keys.sortedDescending()

    fun findClosestValue(value: Int): Int {
        return values.first { it <= value }
    }

    fun intToRoman(num: Int): String {
        var result = ""
        var num = num

        while (num != 0) {
            val value = findClosestValue(num)
            num -= value
            result += valueToRoman[value]
        }

        return result
    }
}
 */
