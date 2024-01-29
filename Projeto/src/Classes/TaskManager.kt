package Classes

import Classes.Enum.StatusTask
import Classes.Object.TaskObject
import Interface_Abastrata.BasicSteels


open class TaskManager(title: String, description: String, duaDate: Triple<Int, Int, Int>, status: StatusTask) :
    Task(title, description, duaDate, status),
    BasicSteels
{
    // Para evitar a criação de um construtur secundário utiliza-se o "init"
    // portanto, é executado antes de todo o codigo
    init {
        println("Usuário criado !!!")
    }

    private val obj = TaskObject()

    override fun adicionarTarefa() {
        obj.adicionarTarefa()
    }

    override fun mostrarTarefas() {
        obj.mostrarTarefas()
    }

    fun listaTarefa(): MutableList<Task?>{
        return obj.informarLista()
    }

    override fun editarTarefa() {
        if (listaTarefa().isNotEmpty()){
            println("Qual tarefa deseja editar?")
            mostrarTarefas()
            var option = readlnOrNull()
            loop@for (i in listaTarefa()){
                if (option == i!!.title){
                    //Editar cada variável de option
                    println("Data de vencimento: ")
                    println("Dia")
                    val dia = readln().toInt()
                    println("Mês")
                    val mes = readln().toInt()
                    println("Ano")
                    val ano = readln().toInt()
                    i.duaDate = Triple(dia,mes,ano)
                    println("Descrição: ")
                    i.description = readlnOrNull().toString()
                    println("Titulo: ")
                    i.title = readlnOrNull().toString()
                    println("Deseja editar mais alguma tarefa? ")
                    println("1 - sim \n 2 - não")
                    val editarNovamente = readlnOrNull()!!.toInt()
                    //Verificar se deseja editar mais alguma tarefa
                    if (editarNovamente == 1){
                        println("Qual tarefa deseja editar?")
                        mostrarTarefas()
                        option = readlnOrNull()
                    }
                    else return
                }
            }
            println("Trefa não encontrada!")
        }
        else{
            println("Nenhuma tarefa para ser editada!")
        }
    }


    //Utilizando filtro de Kotlin
    override fun filterTask(option: Int) {
        if(option == 1) {
            // Filtro ansioso
            for (objeto in obj.taskList.filter { it!!.status == StatusTask.PENDENTE }) {
                println("${objeto!!.title} - ${objeto.status} - ${objeto.description} -${objeto.duaDate} ")
            }
            println()
        }
        else {
            //Filtro preguiçoso "asSequence()"
            for (objeto in obj.taskList.asSequence().filter { it!!.status == StatusTask.CONCLUIDA}){
                println("${objeto!!.title} - ${objeto.status} - ${objeto.description} -${objeto.duaDate} ")
            }
        }
    }

    // Filtrando as tarefas que tenham aquela letra, e passando o filtro como um lambda
    //Inline serve para substituir o lambda, utilizando as instruções dentro dele
    inline fun tasksWithLetters(filtro: (String) -> List<Task?>) {
        var escolha= readln()
        for (objeto in filtro(escolha)){
            println("${objeto!!.title} - ")
        }
    }

    override fun tempoDeVencimento(titulo: String): Triple<Int, Int, Int> {
        return obj.tempoDeVencimento(titulo)
    }

    override fun concluir() {
        println("Qual tarefa deseja concluir?")
        mostrarTarefas()
        val tarefaNome = readln()
        for (i in obj.taskList){
            if (i!!.title == tarefaNome){
                if(i.status == StatusTask.PENDENTE){
                    i.status = StatusTask.CONCLUIDA
                    println("Tarefa marcada como concluía.")
                }
                else{
                    println("Tarefa já foi concluía.")
                }
            }
        }
        println("Tarefa não encontrada!")
    }
}