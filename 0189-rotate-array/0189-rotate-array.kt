class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        for (i in 1..k) {
            val last = nums.last()
            shift(nums)
            nums[0] = last
        }

    }
    
    private fun shift(nums: IntArray) {
        for (i in nums.lastIndex - 1 downTo 0) {
            nums[i+1] = nums[i]
        }

    }
}