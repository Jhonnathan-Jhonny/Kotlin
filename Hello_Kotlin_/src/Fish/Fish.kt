package Fish

fun main(args: Array<String>){
    fishExemple()
}

fun fishExemple() {
    val f1 = Fish("Orca")
    myWith(f1.name){
        println(capitalize())
    }

    println( f1.run { name })

    println(f1.apply { name })

    println(f1.let { it.name.capitalize()}
        .let{it + "fish"}
        .let{it.length}
        .let{it + 31})}

fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}

data class Fish (val name: String)