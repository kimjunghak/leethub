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
    fun countNodes(root: TreeNode?): Int {
        if(root == null) return 0
        var count = 1

        count += if(root.left != null) countNodes(root.left) else 0
        count += if(root.right != null) countNodes(root.right) else 0

        return count
    }
}