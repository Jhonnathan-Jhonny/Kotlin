package Aquarium.Generics

open class WaterSupply(var needsProcessing: Boolean)


// Classes que herdam de WaterSupply
class TapWater : WaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessing = false
    }
}

class FishStoreWater : WaterSupply(false)

class LakeWater : WaterSupply(true) {
    fun filter() {
        needsProcessing = false
    }
}

// Classe genérica, que será evoluida para aceitar apenas tipos WaterSupply

// 1º forma - Aceita qualquer tipo
/*class Aquarium<T>(val waterSupply: T) //OU
class Aquarium<T: Any?>(val waterSupply: T)*/

// 2º forma - Não aceita valores nulos
//class Aquarium<T: Any>(val waterSupply: T)

//3º forma - Aceita apenas valores do tipo especificado e suas subclasses.
//Utilizando  o tipo da SuperClasse no T
class Aquarium<T: WaterSupply>(val waterSupply: T) {
    fun addWater() {
        //Se verdadeiro aparece mensagem de erro
        check(!waterSupply.needsProcessing) { "water supply needs processing first" }
        println("adding water from $waterSupply")
    }
}
//Exemplos
fun genericsExample() {
    val aquarium = Aquarium<TapWater>(TapWater())
    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")
    aquarium.waterSupply.addChemicalCleaners()
    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")

    //Utilizando aquarium na 1º forma = ERRO!!!
//    val aquarium2 = Aquarium("string")
//    println(aquarium2.waterSupply)
//
//    val aquarium3 = Aquarium(null) // Também permite passar valores nulos


}

fun main() {
   // genericsExample()

    // a água deve ser filtrada antes de fazer qualquer coisa.
    // Pois no Check, essa é a condição
    val aquarium4 = Aquarium(LakeWater())
    aquarium4.waterSupply.filter()
    aquarium4.addWater()
}