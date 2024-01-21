import Classes.TaskManager

fun mainMenu(user: TaskManager){
    do {
        println("1- Adicionar tarefa.")
        println("2- Visualizar tarefas a concluir.")
        println("3- Visualizar tarefas concluidas.")
        println("4- Concluir tarefa.")
        println("5- Editar tarefa.")
        println("6- Excluir tarefa.")
        println("7- Filtrar")
        println("8- Sair.")
        var option = readlnOrNull()?.toInt()?:0
        when (option) {
            1 -> user.adicionarTarefa()
            7 -> filterMenu(user)
            else -> break
        }
    } while (true)
}

fun filterMenu(user: TaskManager){
    println("Filtros Disponíveis: ")
    println("1- Tarefas Completas.")
    println("2- Tarefas incompletas.")
    var option = readlnOrNull()?.toInt()
    when(option){
        1 -> user.filterTask(option)
        2 -> user.filterTask(option)
        else -> println("ERRO!!! Tente novamente.")
    }

}

fun main() {
    val user1 = TaskManager()
    mainMenu(user1)
}