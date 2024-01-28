package Classes

import Classes.Enum.StatusTask
import Interface_Abastrata.TaskBase
import java.time.LocalDate

open class Task(
    title: String,
    description: String,
    duaDate: Triple<Int, Int, Int>,
    status: StatusTask
) : TaskBase(title, description, duaDate, status) {
    override fun concluir() {
        TODO("Not yet implemented")
    }

    companion object {
        // Constantes associadas à classe Task
        const val MAX_DESCRIPTION_LENGTH = 100
        private val DEFAULT_STATUS = StatusTask.PENDENTE

        // Método estático (companion object function)
        fun getDefaultTask(): Task {
            return Task("Tarefa Padrão", "Descrição padrão", Triple(1,2,3), DEFAULT_STATUS)
        }
    }

}