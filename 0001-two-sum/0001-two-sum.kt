class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
         val map = mutableMapOf<Int, Int>()

        nums.forEachIndexed {
            index, num ->
            map[target - num]?.let { return intArrayOf(it, index) }
            map[num] = index
        }

        return intArrayOf()
    }
}