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
    fun deleteDuplicates(head: ListNode?): ListNode? {
        if(head == null) return null

        val result = ListNode(0)
        var resultIter = result

        var iter = head
        var curVal = -1000
        while (iter != null) {
            if (curVal != iter.`val`) {
                resultIter.next = ListNode(iter.`val`)
                resultIter = resultIter.next!!
                curVal = iter.`val`
            }
            iter = iter.next
        }

        return result.next
    }
}