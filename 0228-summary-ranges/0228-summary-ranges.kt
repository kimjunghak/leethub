class Solution {
    fun summaryRanges(nums: IntArray): List<String> {
        if(nums.isEmpty()) return listOf()

        val result = mutableListOf<String>()
        val temp = mutableListOf<Int>()
        for (num in nums) {
            if(temp.isEmpty() || num == temp.last() + 1) {
                temp.add(num)
                continue
            }
            makeRanges(temp, result)
            temp.add(num)
        }

        if(temp.isNotEmpty()) makeRanges(temp, result)

        return result
    }
    
    private fun makeRanges(
        temp: MutableList<Int>,
        result: MutableList<String>
    ) {
        val builder = StringBuilder()
        val makeRanges = if(temp.size > 1) builder.append(temp.first()).append("->").append(temp.last()) else builder.append(temp.last())
        result.add(makeRanges.toString())
        temp.clear()
    }
}