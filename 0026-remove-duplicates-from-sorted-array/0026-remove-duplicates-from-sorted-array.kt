class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        val set = nums.toSortedSet()

        set.forEachIndexed { index, value -> nums[index] = value }
        return set.size
    }
}