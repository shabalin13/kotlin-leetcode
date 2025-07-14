package p71

class Solution {
    /*
    Stack approach
    fun simplifyPath(path: String): String {
        val directories = path.split("/")

        val stack = Stack<String>()
        for (dir in directories) {
            if (dir == "" || dir == ".") {
                continue
            } else if (dir == "..") {
                if (!stack.empty()) {
                    stack.pop()
                }
            } else {
                stack.push(dir)
            }
        }

        return stack.joinToString(separator = "/", prefix = "/")
    }
     */

    fun simplifyPath(path: String): String {
        val directories = path.split("/")

        val stack = mutableListOf<String>()

        for (dir in directories) {
            if (dir == "" || dir == "." || (dir == ".." && stack.isEmpty())) continue
            else if (dir == "..") stack.removeLast()
            else stack.add(dir)
        }

        return stack.joinToString(separator = "/", prefix = "/")
    }
}
