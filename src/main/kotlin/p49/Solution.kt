package p49

class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val groupedAnagrams = strs.groupBy { str ->
            str.toList().sorted()
        }
        return groupedAnagrams.values.toList()
    }
}
