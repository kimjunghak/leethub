class MinStack() {

    private val stack = mutableListOf<Int>()

    fun push(`val`: Int) {
        stack.add(`val`)
    }

    fun pop() {
        stack.removeAt(stack.size - 1)
    }

    fun top(): Int {
        return stack[stack.size - 1]
    }

    fun getMin(): Int {
        return stack.minOrNull()!!
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = MinStack()
 * obj.push(`val`)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */