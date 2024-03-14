class Solution {
    fun majorityElement(nums: IntArray): Int {
        var count = 0
        var candidate = nums[0]

        for (num in nums) {
            if (count == 0) candidate = num
            count += if(candidate == num) 1 else -1
        }

        return candidate
    }
}