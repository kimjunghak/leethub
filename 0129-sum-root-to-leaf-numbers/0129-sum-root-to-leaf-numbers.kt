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
        val builder = StringBuilder()
        order(root, list, builder)
        return list.sum()
    }

    private fun order(node: TreeNode?, list: MutableList<Int>, builder: StringBuilder) {
        if(node == null) return
        builder.append(node.`val`)
        if(node.left == null && node.right == null) {
            list.add(builder.toString().toInt())
        } else {
            if(node.left != null) order(node.left, list, builder)
            if(node.right != null) order(node.right, list, builder)
        }

        builder.deleteCharAt(builder.length - 1)
    }
}