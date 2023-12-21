fun main(args: Array<String>){
    val array = intArrayOf(11,12,13,14,15)
    val list : MutableList<String> = mutableListOf("","","","","")
    for(i in 0..4 step 1) {
        list[i] = array[i].toString()
    }

    println("Inteiro: ${array.contentToString()}")
    println("String: $list")
}