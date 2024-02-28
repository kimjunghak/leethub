class Solution {
    fun singleNumber(nums: IntArray): Int {
        val list = mutableListOf<Int>()
        nums.forEach { if(list.contains(it)) list.remove(it) else list.add(it) }
        return list[0]
    }
}