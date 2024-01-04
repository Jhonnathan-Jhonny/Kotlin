package test.kotlin

fun main(args: Array<String>) {
    val l = listOf(1, 2, 3)
    val n : String
    for (i in l.listIterator()){
        println(i)
    }

    println( run { l })
    println(l)

}