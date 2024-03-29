class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val map = mutableMapOf<Char, Int>()
        for (c in magazine) {
            map[c] = map.getOrDefault(c, 0) + 1
        }
        for (c in ransomNote) {
            if(map[c] == null || map[c] == 0) return false
            map[c] = map[c]!! - 1
        }
        return true
    }
}