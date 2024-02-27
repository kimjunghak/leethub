class Solution {
    fun isPalindrome(s: String): Boolean {
        val str = s.lowercase().replace("[^a-z0-9]".toRegex(), "")

        for (i in 0..<str.length / 2) {
            if (str[i] != str[(str.length - 1) - i]) {
                return false
            }
        }

        return true
    }
}