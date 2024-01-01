package Jogo

enum class Direcoes{NORTE, SUL, LESTE, OESTE, INICIO, FIM}

class Jogo{
    var caminho: MutableList<Direcoes> = mutableListOf(Direcoes.INICIO)
    val norte = {caminho.add(Direcoes.NORTE)}
    val sul = {caminho.add(Direcoes.SUL)}
    val leste = {caminho.add(Direcoes.LESTE)}
    val oeste = {caminho.add(Direcoes.OESTE)}
    val fim = {
        caminho.add(Direcoes.FIM)
        println("Game Over")
        println("Trajeto: $caminho")
        exibirCaminhos()
        false
    }

    private fun exibirCaminhos(){
        for (direction in caminho) {
            print("$direction -> ")
        }
        println()
    }
}

fun main(){
    val jogo = Jogo()
    jogo.norte
    jogo.sul
    jogo.leste
    jogo.oeste
    jogo.fim

    println("\nContinuando o trajeto...\n")

    jogo.norte
    jogo.sul
    jogo.leste
    jogo.oeste
    jogo.fim

    println("\nTrajeto final:")
    println("Trajeto: ${jogo.caminho}")
}