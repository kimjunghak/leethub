class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        val firstStr = strs[0]

        for (i in firstStr.indices) {
            val char = firstStr[i]
            for (j in 1..<strs.size) {
                if (i == strs[j].length || strs[j][i] != char) {
                    return firstStr.substring(0, i)
                }
            }
        }
        return firstStr
    }
}