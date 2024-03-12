class Solution {
    fun isHappy(n: Int): Boolean {
        var slow = n
        var fast = n

        do {
            slow = findNext(slow)
            fast = findNext(findNext(fast))
        } while (slow != fast)

        return slow == 1

    }

    fun findNext(n: Int): Int {
        var sum = 0
        var number = n
        while (number > 0) {
            val digit = number % 10
            sum += digit * digit
            number /= 10
        }
        return sum
    }
}