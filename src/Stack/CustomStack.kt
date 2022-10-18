package Stack

class CustomStack {
    var stackList = mutableListOf<Int>()
    var stackSize = 5

    fun popStack():Int{
        if (stackList.size ==0){
            print("underflow")
            return -1
        }else{
            print("item removed ")
            return stackList.removeAt(stackList.size - 1)
        }

    }

    fun pushStack(data:Int){
        if (stackList.size>=stackSize){
            print("Overflow")
        }else{
            print("itemAdded"+data)
            stackList.add(data)
        }
    }

    fun display(list:List<Int>){
        print("items are: \n")
        list.reversed().map {
            print(" "+it)
            print("\n")
        }
    }
}