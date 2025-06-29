package p13

class Solution {
    val symbolsToInt = mapOf<Char, Int>(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )
    fun romanToInt(s: String): Int {
        var result = symbolsToInt[s[0]]!!
        var prevSymbol: Char? = s[0]

        for (i in 1 until s.length) {
            val curSymbol = s[i]
            result += if (prevSymbol == 'I' && (curSymbol == 'V' || curSymbol == 'X') ||
                prevSymbol == 'X' && (curSymbol == 'L' || curSymbol == 'C') ||
                prevSymbol == 'C' && (curSymbol == 'D' || curSymbol == 'M')
            ) {
                symbolsToInt[curSymbol]!! - 2 * symbolsToInt[prevSymbol]!!
            } else {
                symbolsToInt[curSymbol]!!
            }
            prevSymbol = curSymbol
        }

        return result
    }
}
