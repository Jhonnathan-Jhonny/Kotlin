import java.util.*

//criando um função da velocidade do peixe com um valor padrão
fun swim(speed: String = "Fast"){
    println(speed)
}
//Limpar cada do peixe


//valorPadrão
fun shouldChangeWater(day:String, temperature: Int = 22, dirty: Int = 20) :Boolean{
    return when {
        temperature > 30 -> true
        day == "Monday" -> true
        dirty > 30 -> true
        else -> false
    }

}

//  Funções compactas
fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Monday"

//Utilizando as FUNÇÕES COMPACTAS
fun shouldChangeWater_(day:String, temperature: Int = 22, dirty: Int = 20) :Boolean{
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }

}

fun random_Day(): String {
    val week = arrayOf("Monday", "Tuesday", "Wednesday", "thursday","friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun feedThe_Fish() {
    val day = random_Day()
    val food = fishFood(day)
    println ("Today is $day and the fish eat $food")
    println("Change water: ${shouldChangeWater_(day)}")
}



fun main(args: Array<String>){
//    swim()   // uses default speed
//    swim("slow")   // positional argument
//    swim(speed="turtle-like")   // named parameter // Usada caso tenha mais de um parâmetro

    feedThe_Fish()


}
