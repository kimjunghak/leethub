/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun getIntersectionNode(headA:ListNode?, headB:ListNode?):ListNode? {
        val set = mutableSetOf<ListNode>()

        var iterA = headA
        var iterB = headB

        while (iterA != null) {
            set.add(iterA)
            iterA = iterA.next
        }

        while (iterB != null) {
            if(set.contains(iterB)) return iterB
            iterB = iterB.next
        }

        return null
    }
}