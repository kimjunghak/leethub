class Solution {
    fun convertToTitle(columnNumber: Int): String {
        var iter = columnNumber
        val builder = StringBuilder()
        while (iter > 0) {
            builder.append('A' + (--iter % 26))
            iter /= 26
        }

        return builder.reverse().toString()
    }
}