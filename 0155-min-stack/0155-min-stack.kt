class MinStack() {

    private val minQueue = PriorityQueue<Int>()
    private val stack = mutableListOf<Int>()

    fun push(`val`: Int) {
        minQueue.offer(`val`)
        stack.add(`val`)
    }

    fun pop() {
        val last = stack.removeLast()
        minQueue.remove(last)
    }

    fun top(): Int {
        return stack.last()
    }

    fun getMin(): Int {
        return minQueue.peek()
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