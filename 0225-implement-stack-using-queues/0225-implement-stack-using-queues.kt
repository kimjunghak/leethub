class MyStack() {

    private val queue = LinkedList<Int>()

    fun push(x: Int) {
        queue.add(x)
    }

    fun pop(): Int {
        return queue.pollLast()
    }

    fun top(): Int {
        return queue.peekLast()
    }

    fun empty(): Boolean {
        return queue.isEmpty()
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