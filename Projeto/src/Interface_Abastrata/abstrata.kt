package Interface_Abastrata

import Classes.Enum.StatusTask
import java.time.LocalDate

abstract class TaskBase(
    var title: String,
    var description: String,
    var duaDate: Triple<Int,Int,Int>,
    var status: StatusTask = StatusTask.PENDENTE
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

    var startDate: LocalDate = LocalDate.now()
        get() = field
        set(value) {
            field = value
        }

}