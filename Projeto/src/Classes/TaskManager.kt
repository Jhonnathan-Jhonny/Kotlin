package Classes

import Interfaces.BasicSteels

open class TaskManager: BasicSteels {
    var taskList: MutableList<Task?> = mutableListOf()
    override fun adicionarTarefa() {
        print("Título: ")
        val title = readln()
        print("Descrição: ")
        val description = readln()
        print("Data de vencimento: ")
        val dueDate = readln().toInt()
        print("Status: ")
        val status = readln().toBoolean()
        taskList.add(Task(title,description,dueDate,status))
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

    //Utilizando filtro de Kotlin
    override fun filterTask(option: Int) {
        if(option == 1) {
            // Filtro ansioso
            for (objeto in taskList.filter { it!!.status }) {
                print("${objeto!!.title} - ")
            }
            println()
        }
        else {
            //Filtro preguiçoso "asSequence()"
            for (objeto in taskList.asSequence().filter { !it!!.status }){
                println("${objeto!!.title} - ")
            }
        }
    }

}