import java.util.*
// sem o uso o WHEN
fun feedTheFish(){
    val day  = RandomDay()
    val food = "pellets"
    println("Today is $day and the fish eat $food")
}
fun RandomDay() :String{
    val week = arrayOf("Monday", "Tuesday", "Wednesday", "thursday","friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

//Utilizando WHEN

fun fishFood(day:String) :String{
    var food = ""
    when(day){
        "Monday" ->  food = "flakes"
        //"Tuesday" -> food = "pellets"
        "Wednesday" -> food = "redworms"
        "Thursday" -> food = "granules"
        "Friday" -> food = "mosquitoes"
        //"Saturday" -> food = "lettuce"
        "Sunday" -> food = "plankton"
        else -> food = "nothing"
    }
    return food
}
fun main(args: Array<String>){
    val day = RandomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
}