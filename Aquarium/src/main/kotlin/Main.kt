import Aquarium.Aquarium

fun main(args: Array<String>) {
    buildAquarium()
}

fun buildAquarium(){
//    val myAquarium = Aquarium()
//    println("Length: ${myAquarium.length}\n" +
//            "Width: ${myAquarium.width}\n" +
//            "Heigth: ${myAquarium.heigth}")
//
//    println(myAquarium.volume)

    val smallAquarium = Aquarium(length = 20, heigth = 15, width = 30)
    println("Heigth: ${smallAquarium.heigth}")
    println("Small aquarium: ${smallAquarium.volume} liters")
    smallAquarium.volume = 40
    println("Small aquarium: ${smallAquarium.volume} liters")
    println("Heigth: ${smallAquarium.heigth}")
//
//    var myAquarium2 = Aquarium(11)
//    println(myAquarium2)
//
//    println("Small aquarium 2: ${myAquarium2.volume} liters")
//    println("Length: ${myAquarium2.length}\n" +
//            "Width: ${myAquarium2.width}\n" +
//            "Heigth: ${myAquarium2.heigth}")
}