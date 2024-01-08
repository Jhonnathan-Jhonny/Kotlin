import Classes.Usuario

fun main() {
    val usuario1 = Usuario
    do {
        println("1- Adicionar tarefa.")
        println("2- Visualizar tarefas a concluir.")
        println("3- Visualizar tarefas concluidas.")
        println("4- Concluir tarefa.")
        println("5- Editar tarefa.")
        println("6- Excluir tarefa.")
        println("7- Sair.")
        var option = readLine()?.toInt()
        when (option) {
            1 -> usuario1.adicionarTarefa()
            else -> break
        }
    } while (true)
}