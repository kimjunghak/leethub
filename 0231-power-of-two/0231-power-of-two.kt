class Solution {
    fun isPowerOfTwo(n: Int): Boolean {
        if(n == 0) return false
        if(n == 1) return true

        var num = n
        while (num != 2) {
            if(num % 2 != 0) return false
            num /= 2
        }

        return true
    }
}