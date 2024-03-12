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
    fun removeElements(head: ListNode?, `val`: Int): ListNode? {
        if(head == null) return null

        var currentHead = head
        while (currentHead?.`val` == `val`) currentHead = currentHead.next

        var currentNode = currentHead
        var prevNode: ListNode? = null

        while (currentNode != null) {
            if(currentNode.`val` == `val`) prevNode?.next = currentNode.next
            else prevNode = currentNode

            currentNode = currentNode.next
        }

        return currentHead        
    }
}