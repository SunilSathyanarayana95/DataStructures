package search

class LinearSearch {
    fun search(list:List<Int>,item:Int):Int{
        list.map {
            if (item == it){
                print("item found at the index"+list.indexOf(it)+"\n")
                return list.indexOf(it)
            }
        }
        return -1
    }
}