class Solution {
    fun hIndex(citations: IntArray): Int {
        citations.sort()
        for (i in citations.indices) {
            val hIndex = citations.size - i
            if(citations[i] >= hIndex) return hIndex
        }
        return 0
    }
}