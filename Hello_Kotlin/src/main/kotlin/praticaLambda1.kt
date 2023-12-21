import kotlin.random.Random

fun main(args: Array<String>){
    val rollDice: (Int) -> Int = {lado -> if (lado == 0) 0 else Random.nextInt(1,lado)}
    gamePlay(rollDice(6))
}

fun gamePlay(dado: Int){
    println(dado)
}
