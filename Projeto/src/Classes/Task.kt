package Classes

import Classes.Enum.StatusTask
import Interface_Abastrata.TaskBase

open class Task(
    title: String,
    description: String,
    duaDate: Triple<Int, Int, Int>,
    status: StatusTask
) :
    TaskBase(title, description, duaDate, status) {
    override fun concluir() {
        TODO("Not yet implemented")
    }


}