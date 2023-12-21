package Classes

class SimpleSpice(val name: String, val spiciness: String = "mild"){

    val heat: Int
        get() = when(spiciness){"mild" -> 1 "average" -> 2 "high" -> 3 else -> 4}

    init {
        println("Nome: $name Picância: $spiciness")
    }

    fun makeSalt(){

    }

}