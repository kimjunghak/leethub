class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        if(s.isEmpty()) return true
        if(t.isEmpty()) return false
        var index = 0
        for (c in t) {
            if(index >= s.length) return true
            val sChar = s[index]
            if(sChar == c) index++
        }
        return index == s.length
    }
}