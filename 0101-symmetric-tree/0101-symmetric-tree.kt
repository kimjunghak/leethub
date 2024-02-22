/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun isSymmetric(root: TreeNode?): Boolean {
        if(root == null) return true
        if(root.left == null && root.right == null) return true

        val linkedList = LinkedList<TreeNode?>()
        linkedList.add(root.left)
        linkedList.add(root.right)
        while (!linkedList.isEmpty()) {
            val left = linkedList.poll()
            val right = linkedList.poll()

            if(left == null && right == null) continue
            if(left == null || right == null) return false
            if(left.`val` != right.`val`) return false
            else {
                linkedList.add(left.left)
                linkedList.add(right.right)
                linkedList.add(left.right)
                linkedList.add(right.left)
            }
        }
        return true
    }
}