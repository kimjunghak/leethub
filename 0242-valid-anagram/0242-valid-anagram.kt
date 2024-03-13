class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false

        val sMap = HashMap<Char, Int>()
        val tMap = HashMap<Char, Int>()

        s.forEach {
            sMap[it] = sMap.getOrDefault(it, 0) + 1
        }

        t.forEach {
            tMap[it] = tMap.getOrDefault(it, 0) + 1
        }

        for (key in sMap.keys) {
            if(tMap[key] != sMap[key]) return false
        }

        return true
    }
}