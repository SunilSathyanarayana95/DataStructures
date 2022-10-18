package Tree

import com.sun.org.apache.xpath.internal.operations.Bool

class BinarySearchTree {
    var root:Node? = null

    private fun insertNode(currentNode:Node?,data:Int):Node{
        if (currentNode == null){
            return Node(data)
        }
        if (data<currentNode.data){
            currentNode.left = insertNode(currentNode.left,data)
        }else if (data>currentNode.data){
            currentNode.right = insertNode(currentNode.right,data)
        }else{
            return currentNode
        }
        return currentNode
    }

    fun addNode(data:Int){
        root = insertNode(root,data)
    }

    private fun containsNode(currNode:Node?,data:Int):Boolean{
        if (currNode == null){
            return false
        }
        if (data == currNode.data){
            return true
        }
        if (data<currNode.data){
            return containsNode(currNode.left,data)
        } else {
            return containsNode(currNode.right,data)
        }
    }
    fun searchANode(data: Int):Boolean{
        return containsNode(root,data)
    }

    //DFS death first search
    //inorder
    fun treeTraversalInorder(node:Node?){
        treeTraversalInorder(node?.left)
        print(node?.data)
        treeTraversalInorder(node?.right)
    }

    //inorder
    fun treeTraversalPreOrder(node:Node?){
        print(node?.data)
        treeTraversalInorder(node?.left)
        treeTraversalInorder(node?.right)
    }

    //inorder
    fun treeTraversalPostOrder(node:Node?){
        treeTraversalInorder(node?.left)
        treeTraversalInorder(node?.right)
        print(node?.data)
    }

    //BFS death first search

    fun treeTraversalBFS(){

    }
}