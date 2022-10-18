package queue

class CustomQueue {
    var queueList = mutableListOf<Int>()
    var queueSize = 5

    fun enqueue(data:Int){
        if (queueList.size >= queueSize){
            print("Overflow")
        }else{
            print("itemAdded :-- "+data+"\n")
            queueList.add(data)
        }
    }

    fun deque():Int{
        if (queueList.size == 0){
            print("underflow")
            return -1
        }else{
            print("item removed \n")
            return queueList.removeAt(0)
        }
    }

    fun display(list:List<Int>){
        print("items are: \n")
        list.map {
            print(" "+it)
            print("\n")
        }
    }
}