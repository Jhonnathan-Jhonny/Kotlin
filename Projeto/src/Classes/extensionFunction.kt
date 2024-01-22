package Classes

fun TaskManager.delete():Task {
    println("Digite o titulo da tarefa que deseja excluir!")
    var title = readln()
    for (objeto in taskList) {
        if (objeto!!.title == title) {
            taskList.remove(objeto)
            return objeto
        }
    }
    println("Tarefa inexistente!")
    return Task("", "", Triple(0, 0, 0))
}