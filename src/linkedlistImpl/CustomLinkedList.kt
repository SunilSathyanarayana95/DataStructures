package linkedlistImpl

class CustomLinkedList {
       private var head : Node? =null

    fun insertAtFirst(list: CustomLinkedList, item:Int){
        var newNode = Node(item)
        if (list.head == null){
            list.head = newNode
        }else{
            newNode.next = head
            head = newNode
        }

    }

    fun insertAtLast(list: CustomLinkedList, item:Int){
        var newNode = Node(item)
        if (list.head == null){
            list.head = newNode
        }else{
            var currNode = head
            while (currNode?.next != null){
                currNode = currNode?.next
            }
            currNode?.next = newNode
        }
    }

    fun insertAtPosition(list: CustomLinkedList, item:Int, position:Int) {
        var newNode = Node(item)

        if (position == 0){
            insertAtFirst(list,item)
        }else if (position == list.size(list)-1){
            insertAtLast(list,item)
        }else{
            var currNode = list.head
            var currPosition = 0
            while (currNode != null){
                if (currPosition == position){
                    newNode.next = currNode.next
                    currNode.next = newNode
                }
                currPosition++
                currNode = currNode.next
            }
        }

    }

    fun display(list: CustomLinkedList){
        var currNode: Node? = list.head
        print("LinkedList:")
        while (currNode != null){
            print(currNode.data)
            print(",")
            currNode = currNode.next
        }
    }

    fun size(list: CustomLinkedList):Int {
        var node = list.head
        var count = 0
        if (head == null) {
            return count
        } else if (head?.next == null) {
            return ++count
        } else {
            while (node != null) {
                node = node.next
                count++
            }
        }

        return count
    }

}
