class Solution {
    fun strStr(haystack: String, needle: String): Int {
        val m = haystack.length
        val n = needle.length

        for (i in 0..<m - n + 1) {
            if (haystack.substring(i, i + n) == needle)
                return i
        }

        return -1
    }
}