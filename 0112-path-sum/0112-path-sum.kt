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
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        if (root == null) return false
        val rootVal = root.`val`
        val left = root.left
        val right = root.right
        if(left == null && right == null) return targetSum - rootVal == 0
        return hasPathSum(left, targetSum - rootVal) || hasPathSum(right, targetSum - rootVal)
    }
}