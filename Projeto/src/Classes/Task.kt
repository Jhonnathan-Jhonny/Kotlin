package Classes

import java.time.LocalDate

open class Task (val title: String, val description: String, val duaDate: Triple<Int,Int,Int>, val status: Boolean = false){
    init {
        println("Tarefa criada !!!")
    }
    var dataInicio: LocalDate = LocalDate.now()
            get() = field   // Retorna o valor atual da propriedade
            set(value) {
                field = value  // Define o valor da propriedade
            }
    val getDuaDate: Unit
        get() = println("${duaDate.first}/${duaDate.second}/${duaDate.third}")
}