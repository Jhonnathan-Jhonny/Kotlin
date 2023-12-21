val nome = listOf("Maria","José","João","Jhonnathan","Vitória")

fun main(args: Array<String>){
    //Cria uma nova lista
    var  eager = nome.filter { it[0] == 'J' }
    println("eager: $eager")

    // preguiçoso, esperará até ser solicitado para avaliar.
    //conterá um Sequence dos elementos da lista e conhecimento do filtro a ser aplicado a esses elementos.
    val filtered = nome.asSequence().filter { it[0] == 'J' }
    println("Filtered: $filtered")

    // Força a avaliação da sequência convertendo-a em List com toList(). Imprima o resultado.
    val newList = filtered.toList()
    println("NewList: $newList")

    //map() -> Realiza uma transformação simples em cada elemento da sequência.
    val lazyMap = nome.asSequence().map{ println("acess: $it")
        it}
    println("lazy: $lazyMap")
    println("-----")
    println("first: ${lazyMap.first()}")
    println("-----")
    println("all: ${lazyMap.toList()}")


    //Utilizando o map direto com o filtro
    val lazymap2 = nome.asSequence().filter { it[0] == 'J' && it[1] == 'h' }.map {
        println("Acesse: $it")
        it
    }
    println("-------")
    println("Filtered: ${lazymap2.toList()}")
}