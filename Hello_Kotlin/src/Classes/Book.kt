package Classes

open class Book(var titulo: String, var autor: String) {
    private var paginaAtual: Int = 0

    open fun lerPagina() {
        paginaAtual++
    }
}

class eBook(titulo: String, autor: String, val formato: String = "text") : Book(titulo, autor) {
    private var palavraAtual: Int = 0

    override fun lerPagina() {
        palavraAtual += 250 // Cada página tem 250 palavras
    }
}