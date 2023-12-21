import Classes.SimpleSpice

fun main(args: Array<String>){
    creatSimpleSpice()
}
fun creatSimpleSpice() {

    var Spice1 = SimpleSpice("camarão","average")
    var Spice2 = SimpleSpice("camarão","high")
    var Spice3 = SimpleSpice("camarão","mild")
    var Spice4 = SimpleSpice("camarão","high")
    var list = listOf(Spice1,Spice2,Spice3,Spice4)
//    println("Name(nome): ${mySpice.name}\n" +
//            "Heat(aquecer): ${mySpice.heat}")
}
