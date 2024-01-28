import Classes.Enum.StatusTask
import Classes.TaskManager
import Classes.delete

fun mainMenu(user: TaskManager){
    do {
        println("1- Adicionar tarefa.")
        println("2- Tarefas com a letra...")
        println("3- Mostrar tarefas.")
        println("4- Concluir tarefa.")
        println("5- Editar tarefa.")
        println("6- Excluir tarefa.")
        println("7- Filtrar")
        println("8- Sair.")
        val option = readlnOrNull()?.toInt()?:0
        when (option) {
            1 -> user.adicionarTarefa()
            2 -> user.tasksWithLetters { letra:String -> user.listaTarefa().filter {  it!!.title.contains(letra) } }
            3 -> user.mostrarTarefas()
            4-> user.concluir()
            5 -> user.editarTarefa()
            6 -> user.delete()
            7 -> filterMenu(user)
            else -> break
        }
    } while (true)
}

fun filterMenu(user: TaskManager){
    println("Filtros Disponíveis: ")
    println("1- Tarefas incompletas.")
    println("2- Tarefas Ccompletas.")
    when(val option = readlnOrNull()?.toInt()){
        1 -> user.filterTask(option)
        2 -> user.filterTask(option)
        else -> println("ERRO!!! Tente novamente.")
    }
}

fun main() {
    val user1 = TaskManager("","",Triple(0,0,0),StatusTask.PENDENTE)
    mainMenu(user1)


//    val taskSchool = TaskSchool(0.0,"","",Triple(0,0,0),false)
//    taskSchool.adicionarTarefa()

}