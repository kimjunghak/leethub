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
    fun preorderTraversal(root: TreeNode?): List<Int> {
        if(root == null) return emptyList()

        val result = mutableListOf<Int>()
        result.add(root.`val`)
        if(root.left != null) result.addAll(preorderTraversal(root.left))
        if(root.right != null) result.addAll(preorderTraversal(root.right))

        return result
    }
}