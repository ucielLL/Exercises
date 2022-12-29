fun main(args: Array<String>) {
exercise2()
}

fun  exercise1(){
    val exercuse1 = ExerciseOne()
    var conbination =  exercuse1.calCombination("7")

    conbination.forEach { println( it) }

}
fun exercise2(){
    val list1 = ListNode(1,)
    list1.netxNode = ListNode(2)
        .apply { netxNode = ListNode(3)
            .apply { netxNode = ListNode(3)
                .apply { netxNode = ListNode(4) }}}
    val list2 = ListNode(2)
    list2.netxNode = ListNode(3)
        .apply { netxNode = ListNode(4)
            .apply { netxNode = ListNode(5)
                .apply { netxNode = ListNode(6) }}}

    var list = Exercisetwo().mergeList(list1, list2)
    while (list !=null){
        println(list.value)
        list = list.netxNode
    }

}
