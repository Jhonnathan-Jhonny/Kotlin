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
class Aquarium<out T: WaterSupply>(val waterSupply: T) {
    fun addWater(limpar: Limpar<T>){
        //Se verdadeiro aparece mensagem de erro
        if (waterSupply.needsProcessing) {
            limpar.clean(waterSupply)
        }
        println("water added")
    }


}

//Função de extenção
// * serve para dizer que pode receber qualquer tipo de aquário
inline fun <reified R: WaterSupply> Aquarium<*>. hasWaterSupplyOfType() = waterSupply is R
interface Limpar<in T: WaterSupply>{
    fun clean(waterSupply: T)
}
class TapWaterCleaner : Limpar<TapWater>{
    override fun clean(waterSupply: TapWater) = waterSupply.addChemicalCleaners()
}
fun addItemTo(aquarium: Aquarium<WaterSupply>) = println("Adicionado!")
//Exemplos

//Verificar se a água está limpa de forma genérica aceitando qualquer aquário
fun <T : WaterSupply> isWaterClean(aquarium: Aquarium<T>) {
    println("aquarium water is clean: ${!aquarium.waterSupply.needsProcessing}")
}

//verifique se o que foi passado WaterSupply é de um tipo específico, por exemplo, TapWater
inline fun <reified T:WaterSupply> WaterSupply.isOfType() = this is T
fun main() {
    genericsExample()

    // a água deve ser filtrada antes de fazer qualquer coisa.
    // Pois no Check, essa é a condição
//    val aquarium4 = Aquarium(LakeWater())
//    aquarium4.waterSupply.filter()
//    aquarium4.addWater()
}

fun genericsExample() {
    val cleaner = TapWaterCleaner()
    val aquarium = Aquarium(TapWater())
    aquarium.addWater(cleaner)

    isWaterClean(aquarium)

    println(aquarium.waterSupply.isOfType<TapWater>()) //True
    println(aquarium.waterSupply.isOfType<FishStoreWater>()) //False

//    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")
//    aquarium.waterSupply.addChemicalCleaners()
//    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")

    //Utilizando aquarium na 1º forma = ERRO!!!
//    val aquarium2 = Aquarium("string")
//    println(aquarium2.waterSupply)
//
//    val aquarium3 = Aquarium(null) // Também permite passar valores nulos


}