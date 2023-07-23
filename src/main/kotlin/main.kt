fun main(args: Array<String>) {
    exercise3(arrayOf(intArrayOf(1,2,3,4), intArrayOf(5,6,7,8), intArrayOf(9,10,11,12), intArrayOf(13,14,15,16)))

}


fun  exercise1(){
    val exercuse1 = ExerciseOne()
    var conbination =  exercuse1.calCombination("23")

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
fun exercise3(array: Array<IntArray>){

    for (i in array.iterator()){
        for (j in i){ print(  "$j ")
        }
        println(" ")
    }
    var arrayrotate = Exercise3().rotate(array)
      println("Rotate")
    for (i in arrayrotate.iterator()){
        for (j in i){ print(  "$j ")
        }
        println(" ")
    }

}

