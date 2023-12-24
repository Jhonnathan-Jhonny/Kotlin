package Classes

fun main(args: Array<String>){
    val l1 = Livros("Morte e vida severina", "João Cabral de Melo Neto", 1955)
    val(t1,a1,ano1) = l1.TituloAutorAno()
    println("Aqui está o livro $t1, escrito por $a1 em $ano1.")
    println("OU")
    println("Aqui está o livro ${l1.TituloAutorAno().first}, escrito por ${l1.TituloAutorAno().second} em ${l1.TituloAutorAno().third}.")

}

class Livros(val titulo: String, val autor: String, val ano: Int) {
    fun TituloAutor() : Pair<String, String> {
        val tituloAutor = titulo to autor
        return tituloAutor
    }
    fun TituloAutorAno(): Triple<String, String, Int>{
        val tituloAutorAno = Triple(titulo,autor,ano)
        return tituloAutorAno
    }
}