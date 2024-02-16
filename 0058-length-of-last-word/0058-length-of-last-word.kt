class Solution {
    fun lengthOfLastWord(s: String): Int {
        var count = 0
        val trim = s.trim()
        for (i in trim.length-1 downTo 0) {
            if(trim[i] == ' ') break;
            count++
        }

        return count
    }
}