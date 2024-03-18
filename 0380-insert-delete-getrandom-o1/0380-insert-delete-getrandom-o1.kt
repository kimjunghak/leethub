class RandomizedSet() {

    private val map = mutableMapOf<Int, Int>()
    private val list = mutableListOf<Int>()

    fun insert(`val`: Int): Boolean {
        return if(map.contains(`val`)) false
        else {
            list.add(`val`)
            map[`val`] = list.size
            true
        }
    }

    fun remove(`val`: Int): Boolean {
        return if (!map.contains(`val`)) false
        else {
            list.remove(`val`)
            map.remove(`val`)
            true
        }
    }

    fun getRandom(): Int {
        return list.random()
    }

}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * var obj = RandomizedSet()
 * var param_1 = obj.insert(`val`)
 * var param_2 = obj.remove(`val`)
 * var param_3 = obj.getRandom()
 */