class MyQueue() {

    private val s1 = Stack<Int>()
    private val s2 = Stack<Int>()

    fun push(x: Int) {
        s1.push(x)
    }

    fun pop(): Int {
        s1Tos2()
        return s2.pop()
    }

    fun peek(): Int {
        s1Tos2()
        return s2.peek()
    }

    fun empty(): Boolean {
        return s1.isEmpty() && s2.isEmpty()
    }

    private fun s1Tos2() {
        if (s2.isEmpty()) {
            while (s1.isNotEmpty()) s2.push(s1.pop())
        }
    }

}

/**
 * Your MyQueue object will be instantiated and called as such:
 * var obj = MyQueue()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.peek()
 * var param_4 = obj.empty()
 */