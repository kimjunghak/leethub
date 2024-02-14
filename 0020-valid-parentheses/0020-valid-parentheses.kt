import java.util.*

class Solution {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()

        for (c in s) {
            when (c) {
                '(', '{', '[' -> stack.push(c)
                else -> {
                    if(stack.isEmpty()) return false

                    val peek = stack.peek()
                    if(peek == '(' && c == ')' ||
                        peek == '{' && c == '}' ||
                        peek == '[' && c == ']')
                        stack.pop()
                    else return false
                }
            }
        }

        return stack.isEmpty()
    }
}