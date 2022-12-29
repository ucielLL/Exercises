class Exercisetwo {

fun mergeList(list1 : ListNode?, list2 : ListNode?): ListNode?{
     var list = ListNode(0)
    if(list1 == null && list2 == null) return null
    if (list1 == null) {
        return list2
    }
    if (list2 == null) {
        return list1
    }

    when(list1.value <= list2.value){
        true -> {
            list.value = list1.value
            list.netxNode = mergeList(list1.netxNode, list2)
        }
        false ->{
            list.value = list2.value
            list.netxNode = mergeList(list1, list2.netxNode)
         }
    }
    return  list
}

}
class ListNode(var value: Int ){
    var netxNode: ListNode? = null

}