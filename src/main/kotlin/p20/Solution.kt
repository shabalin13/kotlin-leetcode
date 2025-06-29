package p20

class Solution {
    /*
    Implementation with Stack
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        for (char in s) {
            val prev = if (stack.isNotEmpty()) stack.peek() else null
            if (char == '}' && prev != '{') return false
            else if (char == ']' && prev != '[') return false
            else if (char == ')' && prev != '(') return false
            else if (char == '{' || char == '[' || char == '(') stack.push(char)
            else stack.pop()
        }
        return stack.isEmpty()
    }
     */

    fun isValid(s: String): Boolean {
        val stack = mutableListOf<Char>()
        for (char in s) {
            val prev = stack.lastOrNull()
            if (char == '}' && prev != '{') return false
            else if (char == ']' && prev != '[') return false
            else if (char == ')' && prev != '(') return false
            else if (char == '{' || char == '[' || char == '(') stack.add(char)
            else stack.removeLastOrNull()
        }
        return stack.isEmpty()
    }
}

