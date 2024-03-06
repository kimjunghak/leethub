class Solution {
    // you need treat n as an unsigned value
    fun hammingWeight(n:Int):Int {
        var weight = 0
        for (i in 0..31) {
            if(n ushr i and 1 == 1) weight++
        }

        return weight
    }
}