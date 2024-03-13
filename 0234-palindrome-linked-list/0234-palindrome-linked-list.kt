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
    fun isPalindrome(head: ListNode?): Boolean {
        if(head == null) return true

        var slow = head
        var fast = head

        while (fast?.next?.next != null) {
            slow = slow?.next
            fast = fast.next?.next
        }

        var secondHalf = reverseListNode(slow?.next)
        var firstHalf = head

        while (secondHalf != null) {
            if (firstHalf?.`val` != secondHalf.`val`) return false
            firstHalf = firstHalf.next
            secondHalf = secondHalf.next
        }

        return true
    }

    private fun reverseListNode(head: ListNode?): ListNode? {
        var prev: ListNode? = null
        var current = head
        while (current != null) {
            val temp = current.next
            current.next = prev
            prev = current
            current = temp
        }
        return prev
    }
}