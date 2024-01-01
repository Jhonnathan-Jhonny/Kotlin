package Genericos

open class Veiculo (val cor: String, val ano: Int, val nome: String, val limpo: Boolean) : LimparVeiculo<Veiculo> {
    override fun lavar(veiculo: Veiculo){}
}

interface LimparVeiculo<in T: Veiculo>{
    fun lavar(veiculo: T)
}

class Carro(cor: String, ano: Int, nome: String, limpo: Boolean = true) : Veiculo(cor, ano, nome, limpo){
    override fun lavar(veiculo: Veiculo) {
        println("Carro ${veiculo.nome} lavado")
    }
}
class Moto(cor: String, ano: Int, nome: String, limpo: Boolean = false) : Veiculo(cor, ano, nome, limpo){
    override fun lavar(veiculo: Veiculo) {
        println("Moto ${veiculo.nome} lavado")
    }
}

class Garagem<T: Veiculo> (){

    private val garagem: MutableList<Veiculo> = mutableListOf()
    fun estacionar(veiculo: T){
        garagem.add(veiculo)
        println("Estacionado: ${veiculo.nome}")
    }

    fun mostrarVeiculos(){
        for (veiculo in garagem){
            println(veiculo.nome)
        }
    }

    fun LimparVeiculo(veiculo: T){
        if (!veiculo.limpo) {
            veiculo.lavar(veiculo)
        }
    }
}

fun main(args: Array<String>){
    val carro1 = Carro("Preto", 1999, "Gol")
    val moto1 = Moto("Vermelho", 2022, "Fan")
    val garagem1: Garagem<Veiculo> = Garagem()

    garagem1.estacionar(carro1)
    garagem1.estacionar(moto1)
    garagem1.mostrarVeiculos()
    garagem1.LimparVeiculo(carro1)
    garagem1.LimparVeiculo(moto1)
}