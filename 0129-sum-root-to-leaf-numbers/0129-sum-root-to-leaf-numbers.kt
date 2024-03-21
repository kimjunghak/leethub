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
    fun sumNumbers(root: TreeNode?): Int {
        val list = mutableListOf<Int>()
        order(root, list, 0)
        return list.sum()
    }

    private fun order(node: TreeNode?, list: MutableList<Int>, prevNum: Int) {
        if(node == null) return
        val num = prevNum * 10 + node.`val`
        if(node.left == null && node.right == null) {
            list.add(num)
            return
        }
        if(node.left != null) order(node.left, list, num)
        if(node.right != null) order(node.right, list, num)
    }
}