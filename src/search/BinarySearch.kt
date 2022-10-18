package search

class BinarySearch {
    fun binarySearch(list:List<Int>,leftIndex:Int,rightIndex:Int,item:Int):Int{

        if (rightIndex>= leftIndex){
            val mid = leftIndex+(rightIndex-leftIndex)/2
            if (list[mid] == item){
                print("item found")
                return mid
            }
            if (list[mid]>item){
                return binarySearch(list,leftIndex,mid-1,item)
            }
            if (list[mid]<item){
                return binarySearch(list,mid+1,rightIndex,item)
            }
        }
        return -1
    }
}