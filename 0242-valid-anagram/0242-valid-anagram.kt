class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false

        val map = HashMap<Char, Int>()

        s.forEach {
            map[it] = map.getOrDefault(it, 0) + 1
        }

        t.forEach {
            map[it] = map.getOrDefault(it, 0) - 1
        }

        return map.values.all { it == 0 }
    }
}