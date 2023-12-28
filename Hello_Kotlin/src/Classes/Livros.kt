package Classes

import kotlin.random.Random

fun main(args: Array<String>){
    val l1 = Livros("Morte e vida severina", "João Cabral de Melo Neto", 1955,200)
    val l2 = Livros("Morte e vida João", "Maria Vitória", 1955,145)
    val l3 = Livros("Morte e vida Pedro", "João Cabral de Melo Neto", 1955,273)

    l1.libary["João Cabral de Melo Neto"] = "Morte e vida severina"
    l2.libary["Maria Vitória"] = "Morte e vida João"
    l3.libary["João Cabral de Melo Neto"] = "Morte e vida Pedro"


    l1.allBooks = "João Cabral de Melo Neto"
    l2.allBooks = "João Cabral de Melo Neto"
    l3.allBooks = "João Cabral de Melo Neto"

    l1.printURL()
//    val(t1,a1,ano1) = l1.TituloAutorAno()
//    println("Aqui está o livro $t1, escrito por $a1 em $ano1.")
//    println("OU")
//    println("Aqui está o livro ${l1.TituloAutorAno().first}, escrito por ${l1.TituloAutorAno().second} em ${l1.TituloAutorAno().third}.")

}

class Livros(val titulo: String, val autor: String, val ano: Int, var paginas: Int) {

    companion object {
        const val qntMaxLivros = 5
        const val BASE_URL = "https://suaurl.com/"
    }

    fun canBorrow(quantidade: Int): Boolean{
        return when(quantidade){
            in 0..4 ->  true
            else -> false
        }
    }

    var libary: MutableMap<String,String> = mutableMapOf()

    var allBooks: String
        get()  = titulo
        set(value) {
            for ((autor,titulo) in libary){
                if(autor == value) println(titulo)
            }
        }

    fun TituloAutor() : Pair<String, String> {
        val tituloAutor = titulo to autor
        return tituloAutor
    }



    fun TituloAutorAno(): Triple<String, String, Int>{
        val tituloAutorAno = Triple(titulo,autor,ano)
        return tituloAutorAno
    }

    fun printURL(){
        val textURL = "$BASE_URL$titulo.html"
        val textURLFormatado = textURL.replace(" ","-")
        println(textURLFormatado)
    }
}

// FUNÇÃO DE EXTENÇÃO DA CLASSE LIVRO
fun Livros.pesoLivro() =  paginas * 1.5
fun Livros.paginasRasgadas(quantPaginasRasgadas: Int) = if(paginas >= quantPaginasRasgadas) paginas -= quantPaginasRasgadas else paginas = 0

class FilhoteCachorro(){

    fun brincarComLivro(livro: Livros){
        if(livro.paginas > 0) {
            livro.paginasRasgadas(Random.nextInt(0, 100))
        }
        else {
            println("Páginas acabaram !!!")
        }
    }
}

// TESTANDO FUNÇÕES DE EXTENSÃO

//class AquariumPlant(val color: String, private val size: Int)
//fun AquariumPlant?.pull() {
//    this?.apply {
//        println("removing $this")
//    }
//}
//fun main(args: Array<String>) {
//    val plant: AquariumPlant? = AquariumPlant("Red", 10)
//    plant.pull()
//}