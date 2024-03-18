class Solution {
    fun jump(nums: IntArray): Int {
        var count = 0
        var curPosition = 0
        var nextPosition = 0
        for (i in nums.indices) {
            if(curPosition < i) {
                count++
                curPosition = nextPosition
            }
            nextPosition = maxOf(nextPosition, nums[i] + i)
        }

        return count   
    }
}