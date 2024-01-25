package Interface_Abastrata

import Classes.Task
import java.time.LocalDate

abstract class TaskBase(
    val title: String,
    val description: String,
    val duaDate: Triple<Int,Int,Int>,
    var status: Boolean = false
    ){
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

    abstract fun concluir()

}