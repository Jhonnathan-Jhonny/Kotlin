package Classes

import Interfaces.BasicSteels

class TaskManager: BasicSteels {
    override fun adicionarTarefa(): Task {
        val title = readln()
        val description = readln()
        val dueDate = readln().toInt()
        val status = readln().toBoolean()
        return Task(title,description,dueDate,status)
    }

    override fun visualizarTarefaNaoConcluida() {
        TODO("Not yet implemented")
    }

    override fun visualizarTarefaConcluida() {
        TODO("Not yet implemented")
    }

    override fun concluirTarefa() {
        TODO("Not yet implemented")
    }

    override fun editarTarefa() {
        TODO("Not yet implemented")
    }

    override fun exluirTarefa() {
        TODO("Not yet implemented")
    }

}