class ExerciseOne {

    private var number = mapOf( "2" to "abc",
    "3" to "def",
    "4" to "ghi",
    "5" to "jkl",
    "6" to "mno",
    "7" to "pqrs",
    "8" to "tuv",
    "9" to "wxyz")
    private var listCombination = mutableListOf<String>()
     fun calCombination(digits: String): List<String>{
         if(digits.length <=1){
             number[digits]!!.forEach { listCombination.add(it.toString()) }
             return listCombination
         }
         letterCombination(digits,0,"")
         return listCombination

    }
     private fun letterCombination(digits: String, position: Int, actualConbination : String, ) {

         if (position >= digits.length) {
             listCombination.add(actualConbination)
             return
         }

        // var e = number[digits[position].toString()]!!
         var a = digits[position].toString()
         var e = number.get(a)!!

       for (next in e){
             letterCombination(digits,position+1,(actualConbination + next))
       }
    }

}