package Edifícios

//Classificação de tipos
open class MaterialBasicoConstrução (val quantidade: Int = 1)

class Madeira : MaterialBasicoConstrução(4){}

class Tijolo : MaterialBasicoConstrução(8){}

class Predio<T: MaterialBasicoConstrução> (val material: T, val materialBasicoConstrução: Int = 100){

    val materiaisAtuaisNecessarios: Int
        get() = material.quantidade * materialBasicoConstrução

    fun Construir(){
        println("${material::class.simpleName} necessária: $materiaisAtuaisNecessarios")
    }

}

fun <T:MaterialBasicoConstrução> edificioPequeno(building :Predio<T>){
    if (building.materiaisAtuaisNecessarios < 500) println("Small building")
    else println("large building")
}

fun main() {
    val building = Predio(Madeira(),150)
    building.Construir()

    edificioPequeno(building)
}