import Tree.BinarySearchTree
import linkedlistImpl.Node
import search.LinearSearch
import java.util.*


fun main(args: Array<String>) {
    /*
    //Linked List
    var linkedList = CustomLinkedList()
    linkedList.display(linkedList)
    print("linked list size"+linkedList.size(linkedList)+"\n")
    linkedList.insertAtFirst(linkedList,1)
    linkedList.display(linkedList)
    print("linked list size"+linkedList.size(linkedList)+"\n")
    linkedList.insertAtFirst(linkedList,2)
    linkedList.display(linkedList)
    print("linked list size"+linkedList.size(linkedList)+"\n")
    linkedList.insertAtFirst(linkedList,3)
    linkedList.display(linkedList)
    print("linked list size"+linkedList.size(linkedList)+"\n")

    linkedList.insertAtLast(linkedList,4)
    linkedList.display(linkedList)
    print("linked list size"+linkedList.size(linkedList)+"\n")
    linkedList.insertAtLast(linkedList,5)
    linkedList.display(linkedList)
    print("linked list size"+linkedList.size(linkedList)+"\n")
    linkedList.insertAtLast(linkedList,6)
    linkedList.display(linkedList)
    print("linked list size"+linkedList.size(linkedList)+"\n")


    linkedList.insertAtPosition(linkedList,12,0)
    linkedList.display(linkedList)
    print("linked list size"+linkedList.size(linkedList)+"\n")

    linkedList.insertAtPosition(linkedList,13,3)
    linkedList.display(linkedList)
    print("linked list size"+linkedList.size(linkedList)+"\n")*/

   /*
   stack
   var stack = CustomStack()
    stack.pushStack(1)
    stack.pushStack(2)
    stack.pushStack(3)
    stack.pushStack(3)
    stack.pushStack(4)
    stack.display(stack.stackList)
    stack.popStack()
    stack.popStack()
    stack.display(stack.stackList)
    stack.popStack()
    stack.display(stack.stackList)*/

    /*Queue
    var queue = CustomQueue()
    queue.enqueue(1)
    queue.enqueue(2)
    queue.enqueue(3)
    queue.enqueue(4)
    queue.enqueue(5)
    queue.display(queue.queueList)
    queue.deque()
    queue.deque()
    queue.display(queue.queueList)
    queue.deque()
    queue.display(queue.queueList)*/


   /* val tree =BinarySearchTree()
    tree.addNode(6)
    tree.addNode(4)
    tree.addNode(8)
    tree.addNode(3)
    tree.addNode(5)
    tree.addNode(7)
    tree.addNode(9)

    val nodes: Queue<Node> = LinkedList<Node>()
    nodes.remove()*/

    val list = listOf(1,2,3,4,2,1,5,1,9)
    val search = LinearSearch()
    print(search.search(list,9))





}