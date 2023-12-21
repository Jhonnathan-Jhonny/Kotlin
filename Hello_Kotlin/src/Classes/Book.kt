package Classes

import java.awt.print.Book

open class Book (var titulo: String, var autor: String){

    open private var paginaAtual: Int = 0
    open fun lerPagina(){

        paginaAtual++
    }
}

class eBook(val formato: String = "text"): Book() {
    override var palavraAtual: Int = 0
    override  fun lerPagina(){
        palavraAtual += 250 //Cada página tem 250 palavras
    }

}