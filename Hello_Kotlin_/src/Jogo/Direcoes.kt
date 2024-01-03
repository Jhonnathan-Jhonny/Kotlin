package Jogo

enum class Direcoes{NORTE, SUL, LESTE, OESTE, INICIO, FIM}

class Jogo {
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

    fun mover(onde: () -> Unit){}
    fun fazerMover(move: String?){
        when(move){
            "n" -> mover{norte}
            "s" -> mover{sul}
            "l" -> mover {leste}
            "o" -> mover {oeste}
            else -> mover {fim}
        }
    }

    private fun exibirCaminhos(){
        for (direction in caminho) {
            print("$direction -> ")
        }
        println()
    }
}

fun main(){
    val jogador1 = Jogo()
    while (true){
        println("Enter a direction: n/s/l/o:")
        val local = readlnOrNull()
        jogador1.fazerMover(local)
    }
}