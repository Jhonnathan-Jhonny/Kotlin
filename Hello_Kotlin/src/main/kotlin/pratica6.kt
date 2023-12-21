fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun main(args: Array<String>){
    var dirtyLevel = 20
    val waterFilter = { dirty : Int -> dirty / 2}
    println(waterFilter(dirtyLevel))

//    Crie uma variável chamada waterFilter.
//    waterFilter pode ser qualquer função que receba um Int e retorne um Int.
//    Atribuir um lambda a waterFilter.
//    O lambda retorna o valor do argumento dirty dividido por 2.

    val waterFilter2: (Int) -> Int = { dirty -> dirty / 2 }
    println(updateDirty(30,waterFilter2))
}
