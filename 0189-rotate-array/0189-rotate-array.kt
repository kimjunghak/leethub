class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        val size = nums.size
        val temp = IntArray(size)

        for (i in nums.indices) temp[(i+k)% size] = nums[i]
        for (i in nums.indices) nums[i] = temp[i]
    }
}