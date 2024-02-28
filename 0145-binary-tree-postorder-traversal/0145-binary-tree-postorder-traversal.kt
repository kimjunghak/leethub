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
    fun postorderTraversal(root: TreeNode?): List<Int> {
        if(root == null) return emptyList()

        val result = mutableListOf<Int>()
        if(root.left != null) result.addAll(postorderTraversal(root.left))
        if(root.right != null) result.addAll(postorderTraversal(root.right))
        result.add(root.`val`)

        return result
    }
}