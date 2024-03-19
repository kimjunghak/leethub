/**
 * Example:
 * var ti = Node(5)
 * var v = ti.`val`
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var next: Node? = null
 *     var random: Node? = null
 * }
 */

class Solution {
    fun copyRandomList(node: Node?): Node? {
        if (node == null) return null

        val map = mutableMapOf<Node, Node>()
        var head = node
        while (head != null) {
            map[head] = Node(head.`val`)
            head = head.next
        }

        head = node
        while (head != null) {
            map[head]?.next = map[head.next]
            map[head]?.random = map[head.random]
            head = head.next
        }

        return map[node]
    }
}