package Classes

import Interface_Abastrata.TaskBase

open class Task (
    title: String,
    description: String,
    duaDate: Triple<Int, Int, Int>,
    status: Boolean):
    TaskBase(title, description, duaDate, status) {
    override fun concluir() {
        TODO("Not yet implemented")
    }


}