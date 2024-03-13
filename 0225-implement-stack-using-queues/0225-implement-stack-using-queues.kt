class MyStack() {

    private val list = mutableListOf<Int>()
    
    fun push(x: Int) {
        list.add(x)
    }

    fun pop(): Int {
        return list.removeLast()
    }

    fun top(): Int {
        return list[list.lastIndex]
    }

    fun empty(): Boolean {
        return list.size == 0
    }

}

/**
 * Your MyStack object will be instantiated and called as such:
 * var obj = MyStack()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.empty()
 */