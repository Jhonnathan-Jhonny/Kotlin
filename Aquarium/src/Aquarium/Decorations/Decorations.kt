package Aquarium.Decorations

fun main(args: Array<String>){
    makeDecorations()
}

fun makeDecorations(){
    val d1 = Decorations("Granite")
    println(d1)
    val d2 = Decorations("Slate")
    println(d2)
    val d3 = Decorations("Slate")
    println(d3)

    println(d1.equals(d2))
    println(d2.equals(d3))

    val d4: Decorations = d3.copy()
    println(d3)
    println(d4)

    val d5 = Decorations2("Crystal","wood", "Diver")
    println(d5)
}

data class Decorations(val rocks: String){}

data class Decorations2(val rocks: String, val wood: String, val diver: String){}
