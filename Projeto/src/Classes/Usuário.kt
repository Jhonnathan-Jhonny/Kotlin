package Classes

import Interfaces.BasicSteels

object Usuario {
    var taskList: MutableList<Task> = mutableListOf()
   fun adicionarTarefa() {
        var task = TaskManager().adicionarTarefa()
        taskList.add(task)
   }

    fun visualizarTarefaNaoConcluida() {
        TODO("Not yet implemented")
    }

   fun visualizarTarefaConcluida() {
        TODO("Not yet implemented")
   }

    fun concluirTarefa() {
        TODO("Not yet implemented")
    }

    fun editarTarefa() {
        TODO("Not yet implemented")
    }

    fun exluirTarefa() {
        TODO("Not yet implemented")
    }

}