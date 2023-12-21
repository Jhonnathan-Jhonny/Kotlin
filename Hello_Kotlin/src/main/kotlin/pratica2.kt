import java.util.*

fun temperature(): Int{
    val graus = arrayOf(0,5,10,55,80)
    return graus[Random().nextInt(graus.size)]
}


fun main(args: Array<String>) {
    // tipos de retorno
    // Will assign kotlin.Unit
    val isUnit = println("This is an expression")
    println(isUnit)

    val temperature = temperature()
    val isHot = if (temperature > 50) true else false
    println("$temperature $isHot")

    val message = "The water temperature is ${ if (temperature > 50) "too warm" else "OK" }."
    println(message)
}