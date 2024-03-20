class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val map = magazine.groupingBy { it }.eachCount().toMutableMap()

        for (c in ransomNote) {
            if(map[c] == null || map[c] == 0) return false
            map[c] = map[c]!! - 1
        }
        return true
    }
}