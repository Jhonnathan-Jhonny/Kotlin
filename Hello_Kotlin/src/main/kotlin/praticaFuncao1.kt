import java.util.Calendar

fun dayOfWeek(){
    println("What day is it today")
    var day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    when(day){
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")


    }

}

//fun canAddFish(tankSize: Double, currentFish:List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true) : Boolean{
//    val comDecoração: Int = (tankSize * 1.25).toInt()
//    val semDecoração = tankSize * 2
//    val espaçoOcupado = currentFish.sum()
//    val espaçoFinal = espaçoOcupado + fishSize
//    if(hasDecorations){
//        if(comDecoração > espaçoFinal){
//            return true
//        }
//        return false
//    }
//    else{
//        if(semDecoração > espaçoFinal){
//            return true
//        }
//        return false
//    }
//}

fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}

fun main(args: Array<String>){
//    println("Hello world")
//    dayOfWeek()

    //val hora = println(if(args[0].toInt() < 12) "Good morning, Kotlin" else if(args[0].toInt()>23) "ERROR!!!" else "Good night, Kotlin")
   // println(hora)

    println(canAddFish(10.0, listOf(3,3,3)))
    println(canAddFish(8.0, listOf(2,2,2), hasDecorations = false))
    println(canAddFish(9.0, listOf(1,1,3), 3))
    println(canAddFish(10.0, listOf(), 7, true))
}
