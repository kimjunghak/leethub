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
    fun isBalanced(root: TreeNode?): Boolean {
        if (root == null) return true
        val left = root.left
        val right = root.right
        return (abs(depth(left) - depth(right)) <= 1) && isBalanced(left) && isBalanced(right)
    }

    private fun depth(root: TreeNode?): Int {
        if (root == null) return 0
        return maxOf(depth(root.left), depth(root.right)) + 1
    }
}