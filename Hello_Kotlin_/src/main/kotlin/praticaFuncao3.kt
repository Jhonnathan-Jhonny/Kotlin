fun main(args: Array<String>){
    println(whatShouldIDoToday("sad", weather = "cloudy"))
}

fun whatShouldIDoToday(mood: String = mood(), weather: String = weather(), temperature: Int = temperature1()) : String {
    return when{
        mood == "happy" && weather == "Sunny" -> "go for a walk"
        temperature > 27 -> "let's swim"
        mood == "sad" && weather == "cloudy" -> "to sleep"
        else -> "let's live"
    }
}

fun mood (): String = "Happy"
fun weather (): String = "Sunny"
fun temperature1 (): Int = 24

