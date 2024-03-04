class Solution {
    fun titleToNumber(columnTitle: String): Int {
        var result = 0
        for (ct in columnTitle) {
            val digitValue = ct - 'A' + 1
            result = result * 26 + digitValue
        }

        return result        
    }
}