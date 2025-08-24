package p374

abstract class GuessGame() {
    private val pick: Int = 6
    abstract fun guessNumber(n: Int): Int
    fun guess(num: Int): Int {
        return if (num > pick) -1
        else if (num < pick) 1
        else 0
    }
}
