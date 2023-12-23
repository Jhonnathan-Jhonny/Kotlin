package Classes
fun main(args: Array<String>){
    makeSpiceContainer()
}

fun makeSpiceContainer(){
    val s1 = SpiceContainer("Salmão","mar")
    val s2: SpiceContainer = s1.copy()
    println(s1)
    println(s2)

    println(s1.equals(s2))

    //Desestruturação
    val (espe,tipo) = s1
    println(espe)
    println(tipo)

}

data class SpiceContainer(val especiarias: String, val tipo: String)

