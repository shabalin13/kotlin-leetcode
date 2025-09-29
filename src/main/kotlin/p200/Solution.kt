package p200

class Solution {
    fun numIslands(grid: Array<CharArray>): Int {
        val rows = grid.size
        val cols = grid[0].size
        val visited = Array(rows) { BooleanArray(cols) { false } }

        fun bfs(row: Int, col: Int) {
            val queue = ArrayDeque<IntArray>()
            visited[row][col] = true
            queue.add(intArrayOf(row, col))

            while (queue.isNotEmpty()) {
                val (row, col) = queue.removeFirst()
                val dirs = arrayOf(
                    intArrayOf(-1, 0), intArrayOf(1, 0), intArrayOf(0, -1), intArrayOf(0, 1)
                )
                for (dir in dirs) {
                    val r = row + dir[0]
                    val c = col + dir[1]

                    if (r in 0 until rows &&
                        c in 0 until cols &&
                        grid[r][c] == '1' &&
                        !visited[r][c]
                    ) {
                        queue.add(intArrayOf(r, c))
                        visited[r][c] = true
                    }
                }
            }
        }

        var count = 0
        for (row in 0 until rows) {
            for (col in 0 until cols) {
                if (grid[row][col] == '1' && !visited[row][col]) {
                    bfs(row, col)
                    count++
                }
            }
        }

        return count
    }
}
