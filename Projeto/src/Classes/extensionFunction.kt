package Classes

import Classes.Enum.StatusTask

fun TaskManager.delete():Task {
    println("Digite o titulo da tarefa que deseja excluir!")
    var title = readln()
    for (objeto in listaTarefa()) {
        if (objeto!!.title == title) {
            listaTarefa().remove(objeto)
            return objeto
        }
    }
    println("Tarefa inexistente!")
    return Task("", "", Triple(0, 0, 0),StatusTask.PENDENTE)
}